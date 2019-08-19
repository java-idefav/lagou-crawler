package com.wzx.lagou.controllers.api;

import com.alibaba.fastjson.JSON;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
import com.wzx.lagou.model.dto.TbUserDto;
import org.apache.http.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/lagou")
@ResponseBody
public class LoginVerifyContrller {

    @RequestMapping("/verify")
    public Response<TbUserDto> loginVerify(HttpServletRequest request, HttpServletResponse response){
        try {
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")){
                    String token = cookie.getValue();
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.COOKIE, "token="+token);
                    HttpEntity<Header> formeEntity = new HttpEntity<Header>(headers);
                    ResponseEntity<String> responseEntity = new RestTemplate().postForEntity("http://sso.bluesky.com:8080/lagou/user/verify", formeEntity, String.class);
                    if(responseEntity.getStatusCode()== HttpStatus.OK){
                        Response responseData = JSON.parseObject(responseEntity.getBody().toString(), Response.class);
                        if (responseData.getCode()==1){
                            Cookie responseCookie = new Cookie("token",token);
                            responseCookie.setDomain("bluesky.com");
                            responseCookie.setPath("/");
                            responseCookie.setMaxAge(3600);
                            response.addCookie(responseCookie);
                            return ResponseFactory.success(JSON.parseObject(responseData.getData().toString(),TbUserDto.class));
                        }
                    }
                }
            }
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return ResponseFactory.fail("验证失败,没有权限!");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("发生不可预料的错误!");
        }
    }

}
