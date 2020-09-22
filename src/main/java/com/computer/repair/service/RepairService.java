package com.computer.repair.service;

import com.computer.repair.pojo.dto.PageDTO;
import com.computer.repair.pojo.dto.ResponseDTO;
import com.computer.repair.pojo.query.RepairQuery;
import com.computer.repair.pojo.vo.RepairVO;

public interface RepairService {
    ResponseDTO add(RepairVO repairVO);

    PageDTO ajaxMyList(RepairQuery repairQuery);
}
