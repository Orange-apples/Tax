package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.entity.Dept;
import com.galaxy.tax.dao.DeptDao;
import com.galaxy.tax.service.DeptService;
import org.springframework.stereotype.Service;

/**
 * (TaxDept)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 16:49:14
 */
@Service("taxDeptService")
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {
}