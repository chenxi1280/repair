package com.computer.repair.controller;

import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.query.UserQuery;
import com.computer.repair.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController  {
    @Resource
    UserService userService;

    @RequestMapping("/ims/loginPage")
    String loginImsPage(){
        return "loginIms";
    }

    @RequestMapping("/loginPage")
    String loginPage(){
        return "login";
    }
    @RequestMapping("/back/home")
    String backhome(){
        return "home";
    }

    @RequestMapping("/back/myRepairPage")
    String myRepairPage(){
        return "myRepairPage";
    }

    @RequestMapping("/back/addPCRepairPage")
    String addPCRepairPage(){
        return "addPCRepair";
    }


    @RequestMapping("/ajaxlogin")
    @ResponseBody
    ResponseDTO ajaxlogin(UserQuery userQuery){
        return userService.ajaxlogin(userQuery);
    }



}
