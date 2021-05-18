package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> query4Login(User record) {
        return userMapper.query4Login(record);
    }

    @Override
    public List<User> queryUserInfoByParams(User record) {
        return userMapper.queryUserInfoByParams(record);
    }
}
