package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.galaxy.tax.entity.Account;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * (Account)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 16:35:54
 */
@CacheNamespace(blocking = true,flushInterval = 60000)
public interface AccountDao extends BaseMapper<Account> {

    String getImg(Integer id);
}