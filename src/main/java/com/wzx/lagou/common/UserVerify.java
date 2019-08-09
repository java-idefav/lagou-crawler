package com.wzx.lagou.common;

import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class UserVerify {

    @Autowired
    private UserService userService;

    public Boolean loginVerify(TbUserDto userDto, HttpSession session){
        TbUserDto user = (TbUserDto) session.getAttribute("user");
        if (user!=null&&user.getUserId()==userDto.getUserId()){
            return true;
        }
        return false;
    }
}
