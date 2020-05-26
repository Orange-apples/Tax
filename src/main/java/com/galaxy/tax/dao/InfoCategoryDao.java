package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.InfoCategory;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * (TaxInfocategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 16:24:52
 */
@CacheNamespace(blocking = true,flushInterval = 60000)

public interface InfoCategoryDao extends BaseMapper<InfoCategory> {


}