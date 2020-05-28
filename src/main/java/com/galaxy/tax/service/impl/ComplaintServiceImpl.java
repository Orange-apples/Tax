package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.component.ConstantNum;
import com.galaxy.tax.dao.ComplaintDao;
import com.galaxy.tax.entity.Complaint;
import com.galaxy.tax.service.ComplaintService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * (Complaint)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 16:35:55
 */
@Service("ComplaintService")
public class ComplaintServiceImpl extends ServiceImpl<ComplaintDao, Complaint> implements ComplaintService {
@Resource
ComplaintDao complaintDao;

    @Override
    public Page<Complaint> queryByPage(Integer pages, String title,String state,String startTime,String endTime) throws ParseException {
        QueryWrapper<Complaint> wrapper = new QueryWrapper<>();
        if(!"".equals(title))wrapper.like("title",title);
        if(!"".equals(state))wrapper.eq("state",state);
        if(!"".equals(endTime))wrapper.lt("create_time",endTime);
        if(!"".equals(startTime))wrapper.gt("create_time",startTime);
        return complaintDao.selectPage(new Page<Complaint>(pages,ConstantNum.PAGESIZE),wrapper);
    }
}