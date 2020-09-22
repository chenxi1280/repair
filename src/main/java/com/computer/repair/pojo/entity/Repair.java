package com.computer.repair.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * repair
 * @author 
 */
@Data
public class Repair implements Serializable {
    /**
     * 电脑维修id
     */
    private Integer rId;

    /**
     * 电脑名字
     */
    private String computerName;

    private Date createTime;

    private Date updataTime;

    private Date endingTime;

    /**
     * 描述
     */
    private String content;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 电话号码
     */
    private Integer phoneNumber;

    /**
     * 标题
     */
    private String rTitile;

    /**
     * 地址
     */
    private String address;

    /**
     * 所属用户id
     */
    private Integer uid;

    private static final long serialVersionUID = 1L;
}