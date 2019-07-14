package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbUser;
import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.repository.auto.TbUserMapper;
import com.wzx.lagou.service.UserService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.util.locale.provider.FallbackLocaleProviderAdapter;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public TbUserDto selectUser(Integer userId) {
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(userId);
        return mapperFacade.map(tbUser, TbUserDto.class);
    }

    public Boolean addUser(TbUserDto tbUserDto) {
        TbUserDto userDto = selectUser(tbUserDto.getId());
        TbUser tbUser = mapperFacade.map(tbUserDto, TbUser.class);
        Boolean status = false;
        if (userDto == null){
            status = tbUserMapper.insertSelective(tbUser) > 0;
        }
        return status;
    }

    public Boolean deleteUser(Integer userId) {
        return tbUserMapper.deleteByPrimaryKey(userId) > 0;
    }

    public Boolean changeUser(TbUserDto tbUserDto) {
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(tbUserDto.getId());
        Boolean status = false;
        if (tbUser != null){
            tbUser = mapperFacade.map(tbUserDto, TbUser.class);
            status = tbUserMapper.updateByPrimaryKeySelective(tbUser) > 0;
        }
        return status;
    }
}
