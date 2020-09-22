package com.computer.repair.service;

import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.query.UserQuery;

public interface UserService {

    ResponseDTO ajaxlogin(UserQuery userQuery);
}
