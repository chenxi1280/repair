package com.computer.repair.service.impl;

import com.computer.repair.dao.RepairDao;
import com.computer.repair.pojo.dto.PageDTO;
import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.entity.User;
import com.computer.repair.pojo.query.RepairQuery;
import com.computer.repair.pojo.vo.RepairVO;
import com.computer.repair.service.BaseService;
import com.computer.repair.service.RepairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RepairServiceImpl implements RepairService, BaseService {

    @Resource
    RepairDao repairDao;



    @Override
    public ResponseDTO add(RepairVO repairVO) {
        repairVO.setCreateTime(new Date());
        repairVO.setStatus(0);
        repairVO.setPhoneNumber(Integer.valueOf(repairVO.getStatus()));
        return ResponseDTO.get(1 == repairDao.insertSelective(repairVO));
    }

    @Override
    public PageDTO ajaxMyList(RepairQuery repairQuery) {
        User user = (User) getRequstSession().getAttribute("user");
        repairQuery.setUserId(user.getUserId());
        List<RepairVO> repairVOS = repairDao.ajaxMyList(repairQuery);
        return PageDTO.setPageData(repairVOS.size(),repairVOS);
    }
}
