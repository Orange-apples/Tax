package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.component.ConstantNum;
import com.galaxy.tax.dao.AccountDao;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 16:35:55
 */
@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {
    @Resource
    AccountDao accountDao;

    @Override
    public Page<Account> queryAll(Integer pages, Account account) {
        return accountDao.selectPage(new Page<Account>(pages, ConstantNum.PAGESIZE), new QueryWrapper<Account>()
                .like("name", account.getName())
        );
    }

    @Override
    public String getImg(Integer id) {
        return accountDao.getImg(id);
    }

    @Override
    public Account login(Account account) {
        return accountDao.selectOne(new QueryWrapper<Account>()
                .eq("name", account.getName())
                .eq("password", account.getPassword()));
    }

}