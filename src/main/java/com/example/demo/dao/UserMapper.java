package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

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

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
