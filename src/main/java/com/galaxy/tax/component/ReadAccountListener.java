package com.galaxy.tax.component;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.service.AccountService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Scope(value = "prototype")
public class ReadAccountListener extends AnalysisEventListener<Account> {
    @Resource
    AccountService accountService;
    @Override
    public void invoke(Account account, AnalysisContext analysisContext) {
        System.out.println(account);
        accountService.save(account);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
