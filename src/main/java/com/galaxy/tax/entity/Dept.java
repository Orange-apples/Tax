package com.galaxy.tax.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxDept)实体类
 *
 * @author makejava
 * @since 2020-05-15 16:49:14
 */@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName(value = "dept",keepGlobalPrefix = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = 992506335639082787L;
    
    private Integer id;
    
    private String name;


}