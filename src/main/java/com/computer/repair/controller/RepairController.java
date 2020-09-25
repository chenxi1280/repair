package com.computer.repair.controller;

import com.computer.repair.pojo.dto.PageDTO;
import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.entity.Repair;
import com.computer.repair.pojo.query.PageQuery;
import com.computer.repair.pojo.query.RepairQuery;
import com.computer.repair.pojo.vo.RepairVO;
import com.computer.repair.service.RepairService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/back/repair")
public class RepairController extends  BaseController{

    @Resource
    RepairService repairService;

    @RequestMapping("add")
    @ResponseBody
    ResponseDTO add(RepairVO repairVO){
        return repairService.add(repairVO);
    }

    @RequestMapping("ajaxMyList")
    @ResponseBody
    PageDTO ajaxMyList(RepairQuery repairQuery){
        HttpServletRequest request = getRequest();
        repairQuery.setUserId((Integer) request.getSession().getAttribute("uId"));
        return repairService.ajaxMyList(repairQuery);
    }

}
