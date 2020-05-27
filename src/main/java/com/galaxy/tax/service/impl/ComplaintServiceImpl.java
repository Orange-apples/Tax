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
    public Page<Complaint> queryByPage(Integer pages, String title) {
        return complaintDao.selectPage(new Page<Complaint>(pages,ConstantNum.PAGESIZE),new QueryWrapper<Complaint>()
        .like("title",title)
        );
    }
}