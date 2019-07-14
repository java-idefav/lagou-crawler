package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbUserDto;

public interface UserService {
    TbUserDto selectUser(Integer userId);
    Boolean addUser(TbUserDto tbUserDto);
    Boolean deleteUser(Integer userId);
    Boolean changeUser(TbUserDto tbUserDto);
}
