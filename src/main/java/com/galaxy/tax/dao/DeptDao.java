package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.Dept;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * (TaxDept)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 16:49:14
 */
@CacheNamespace(blocking = true,flushInterval = 60000)

public interface DeptDao extends BaseMapper<Dept> {

    }