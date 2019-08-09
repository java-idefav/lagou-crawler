package com.wzx.lagou.controllers.api;

import com.wzx.lagou.common.AOPHandle;
import com.wzx.lagou.common.Login;
import com.wzx.lagou.common.UserVerify;
import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.service.UserService;
import org.codehaus.janino.Java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public TbUserDto getUserinfo(String userId){
        return userService.selectUser(userId);
    }

    @RequestMapping("/loginverify")
    @ResponseBody
    public Boolean loginVerify(@RequestBody TbUserDto userDto, HttpSession session){
        TbUserDto userDto1 = userService.selectUser(userDto.getUserId());
        boolean status = userDto.getUserPwd().equals(userDto1.getUserPwd());
        if (status){
            session.setAttribute("user", userDto);
        }
        return status;
    }

    @RequestMapping("/verify")
    @ResponseBody
    public Object verifyUser(String username,String name,HttpSession session){
//        TbUserDto userDto = new TbUserDto();
//        userDto.setUserId(username);
//        Boolean verifyStatus = userVerify.loginVerify(userDto, session);
//        if (verifyStatus){
//            UserController userController = new UserController();
//            AOPHandle aopHandle = new AOPHandle();
//            Proxy.newProxyInstance(UserController.class.getClassLoader(), , )
//        }
        return false;
    }

    @RequestMapping("/adduser")
    public Boolean addUser(@RequestBody TbUserDto userDto){
        return userService.addUser(userDto);
    }

    @RequestMapping("/deluser")
    public Boolean delUser(String userId){
        return userService.deleteUser(userId);
    }

    @RequestMapping("/changeuser")
    public Boolean changeUser(TbUserDto userDto){
        return userService.changeUser(userDto);
    }
}
