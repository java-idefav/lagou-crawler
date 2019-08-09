package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbUserDto;

public interface UserService {
    TbUserDto selectUser(String userId);
    Boolean isHaveUser(String userId);
    Boolean addUser(TbUserDto tbUserDto);
    Boolean deleteUser(String userId);
    Boolean changeUser(TbUserDto tbUserDto);
}
