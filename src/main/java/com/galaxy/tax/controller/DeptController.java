package com.galaxy.tax.controller;

import com.galaxy.tax.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TaxDept)表控制层
 *
 * @author makejava
 * @since 2020-05-15 16:49:14
 */
@RestController
@RequestMapping("taxDept")
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

}