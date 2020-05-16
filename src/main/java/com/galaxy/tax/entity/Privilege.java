package com.galaxy.tax.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxPrivilege)实体类
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Privilege implements Serializable {
    private static final long serialVersionUID = -93089283478597169L;
    
    private Integer id;
    
    private String name;
    
    private String code;



}