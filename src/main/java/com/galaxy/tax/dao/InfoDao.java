package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.Info;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Info)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 15:32:51
 */
@CacheNamespace(blocking = true,flushInterval = 60000)

public interface InfoDao extends BaseMapper<Info> {


}