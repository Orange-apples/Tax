package com.galaxy.tax.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.galaxy.tax.entity.Account;

/**
 * (Account)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 16:35:54
 */
public interface AccountService extends IService<Account> {

    Page<Account> queryAll(Integer pages, Account account);

    String getImg(Integer id);
}