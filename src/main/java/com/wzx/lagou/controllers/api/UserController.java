package com.wzx.lagou.controllers.api;

import com.sun.media.sound.SoftTuning;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.wzx.lagou.common.*;
import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.service.UserService;
import org.codehaus.janino.Java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Proxy;

@ResponseBody
@RequestMapping("/lagou/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @Autowired
//    private UserVerify userVerify;

    @Login
    @RequestMapping("/getuser")
    public Response<TbUserDto> getUserinfo(String userId){
        try {
            TbUserDto userDto = userService.selectUser(userId);
            return ResponseFactory.success(userDto);
        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("获取数据失败!");
        }
    }

    @RequestMapping("/loginverify")
    @ResponseBody
    public Response<Boolean> loginVerify(@RequestBody TbUserDto userDto, HttpSession session){
        boolean status = false;
        try {
            TbUserDto userDto1 = userService.selectUser(userDto.getUserId());
            status = userDto.getUserPwd().equals(userDto1.getUserPwd());
        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("出现错误,验证失败!");
        }
        if (status){
            session.setAttribute("user", userDto);
        }
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseFactory.fail("出现错误,验证失败!");
        //return ResponseFactory.success(status);
    }

//    @RequestMapping("/verify")
//    @ResponseBody
//    public Object verifyUser(String username,String name,HttpSession session){
//        TbUserDto userDto = new TbUserDto();
//        userDto.setUserId(username);
//        Boolean verifyStatus = userVerify.loginVerify(userDto, session);
//        if (verifyStatus){
//            UserController userController = new UserController();
//            AOPHandle aopHandle = new AOPHandle();
//            Proxy.newProxyInstance(UserController.class.getClassLoader(), , )
//        }
//        return false;
//    }

    @RequestMapping("/adduser")
    public Response<Boolean> addUser(@RequestBody TbUserDto userDto){
        try {
            return ResponseFactory.success(userService.addUser(userDto));
        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("出现错误,添加失败!");
        }
    }

    @RequestMapping("/deluser")
    public Response<Boolean> delUser(String userId){
        try {
            return ResponseFactory.success(userService.deleteUser(userId));
        }catch (Exception e) {
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("出现错误,删除失败!");
        }
    }

    @RequestMapping("/changeuser")
    public Response<Boolean> changeUser(TbUserDto userDto){
        try {
            return ResponseFactory.success(userService.changeUser(userDto));
        }catch (Exception e) {
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("出现错误,删除失败!");
        }
    }
}
