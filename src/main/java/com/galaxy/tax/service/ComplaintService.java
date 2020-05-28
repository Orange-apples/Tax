package com.galaxy.tax.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.galaxy.tax.entity.Complaint;

import java.text.ParseException;

/**
 * (Complaint)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 16:35:54
 */
public interface ComplaintService extends IService<Complaint> {

    Page<Complaint> queryByPage(Integer pages, String title,String state,String startTime,String endTime) throws ParseException;

}