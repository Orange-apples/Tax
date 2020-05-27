package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.Complaint;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * (Complaint)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 16:35:54
 */
@CacheNamespace(blocking = true,flushInterval = 60000)
public interface ComplaintDao extends BaseMapper<Complaint> {

}