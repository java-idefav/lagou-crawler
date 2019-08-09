package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbUser;
import com.wzx.lagou.model.auto.TbUserExample;
import com.wzx.lagou.model.dto.TbUserDto;
import com.wzx.lagou.repository.auto.TbUserMapper;
import com.wzx.lagou.service.UserService;
import ma.glasnost.orika.MapperFacade;

import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public TbUserDto selectUser(String userId) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        TbUser tbUser = tbUserMapper.selectByExample(example).get(0);
        return mapperFacade.map(tbUser, TbUserDto.class);
    }

    @Override
    public Boolean isHaveUser(String userId) {
        return null;
    }

    public Boolean addUser(TbUserDto tbUserDto) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(tbUserDto.getUserId());
        List<TbUser> userList = tbUserMapper.selectByExample(example);
        TbUser tbUser = mapperFacade.map(tbUserDto, TbUser.class);
        Boolean status = false;
        if (userList.size() <= 0){
            status = tbUserMapper.insertSelective(tbUser) > 0;
        }
        return status;
    }

    public Boolean deleteUser(String userId) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return tbUserMapper.deleteByExample(example) > 0;
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
