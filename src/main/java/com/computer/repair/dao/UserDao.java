package com.computer.repair.dao;

import com.computer.repair.pojo.entity.User;
import com.computer.repair.pojo.query.UserQuery;

public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User ajaxlogin(UserQuery userQuery);
}