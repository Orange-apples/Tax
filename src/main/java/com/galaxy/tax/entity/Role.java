package com.galaxy.tax.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.List;

/**
 * (TaxRole)实体类
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(excludeProperty = {"privileges"},resultMap = "RoleMap")
public class Role implements Serializable {
    private static final long serialVersionUID = -28068830298059156L;
    
    private Integer id;

    @Length(min = 1,message = "角色名不能为空")
    private String name;
    
    private String state;

    private List<Privilege> privileges;

}