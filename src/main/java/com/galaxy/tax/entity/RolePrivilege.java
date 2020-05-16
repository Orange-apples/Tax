package com.galaxy.tax.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxRolePrivilege)实体类
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePrivilege implements Serializable {
    private static final long serialVersionUID = -17735262084256347L;
    
    private Integer rId;
    
    private Integer pId;


}