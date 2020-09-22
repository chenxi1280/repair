package com.computer.repair.service.impl;


import com.computer.repair.dao.UserDao;
import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.entity.User;
import com.computer.repair.pojo.query.UserQuery;
import com.computer.repair.service.BaseService;
import com.computer.repair.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService, BaseService {
    @Resource
    UserDao userDao;


    @Override
    public ResponseDTO ajaxlogin(UserQuery userQuery) {
        try {
            User user = userDao.ajaxlogin(userQuery);
            if (user != null ){
                getRequstSession().setAttribute("user",user);
                getRequstSession().setAttribute("uId",user.getUserId());
                return ResponseDTO.ok("登录成功");
            }

        }catch (Exception e){
            e.printStackTrace();
            ResponseDTO.fail("账户密码错误") ;
        }
        return ResponseDTO.fail("账户密码错误");
    }
}
