package com.wzx.lagou.common;

import com.alibaba.fastjson.JSON;
import com.wzx.lagou.model.dto.TbUserDto;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class VerifyAop {

//    @Pointcut("execution(public * com.wzx.lagou.controllers.api.*.*(..)))")
//    private void aopPotCut(){
//
//    }
//
//    @Pointcut("aopPotCut() && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    private void test1(){}

    @Pointcut("@annotation(Login) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void loginAopPointCut(){}

    @Around("loginAopPointCut()")
    public Object aroundProc(ProceedingJoinPoint joinpoint){
        System.out.println("AOP前置代理");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//        Map<String,Object> result=new HashMap<String, Object>();
//        result.put("code", 0);
        try {
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")){
                    String token = cookie.getValue();
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.COOKIE, "token="+token);
                    HttpEntity<Header> formeEntity = new HttpEntity<Header>(headers);
                    ResponseEntity<String> responseEntity = new RestTemplate().postForEntity("http://sso.bluesky.com:8080/lagou/user/verify", formeEntity, String.class);
                    if(responseEntity.getStatusCode()==HttpStatus.OK){
                        Response responseData = JSON.parseObject(responseEntity.getBody().toString(), Response.class);
                        if (responseData.getCode()==1){
                            Cookie responseCookie = new Cookie("token",token);
                            responseCookie.setDomain("bluesky.com");
                            responseCookie.setPath("/");
                            responseCookie.setMaxAge(3600);
                            response.addCookie(responseCookie);
                            return joinpoint.proceed();
                        }
                    }
                }
            }
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return ResponseFactory.fail("验证失败,没有权限!");

//            TbUserDto user = (TbUserDto) request.getSession().getAttribute("user");
//
//            if (user==null){
//                response.setStatus(HttpStatus.UNAUTHORIZED.value());
//
//                return ResponseFactory.fail("验证失败,没有权限!");
//            }
//            return joinpoint.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("发生不可预料的错误!");
        }
    }

}
