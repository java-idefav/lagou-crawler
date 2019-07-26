package com.wzx.lagou.controllers.api;

import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lagou/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getuser")
    public TbUserDto getUserinfo(Integer userId){
        return userService.selectUser(userId);
    }
}
