package com.computer.repair.dao;

import com.computer.repair.pojo.entity.Repair;
import com.computer.repair.pojo.query.RepairQuery;
import com.computer.repair.pojo.vo.RepairVO;

import java.util.List;

public interface RepairDao {
    int deleteByPrimaryKey(Integer rId);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);

    List<RepairVO> ajaxMyList(RepairQuery repairQuery);
}