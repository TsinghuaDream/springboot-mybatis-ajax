package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 登录查询
     *
     * @param record 参数实体类
     * @return 查询结果集
     */
    List<User> query4Login(User record);
    /**
     * 根据用户参数自定义查询
     *
     * @param record 用户参数实体类
     * @return 查询结果集
     */
    List<User> queryUserInfoByParams(User record);
}
