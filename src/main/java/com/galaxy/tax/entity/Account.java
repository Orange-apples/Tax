package com.galaxy.tax.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-05-15 16:41:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(excludeProperty = {"dept","role"},resultMap = "AccountMap")
public class Account implements Serializable {
    private static final long serialVersionUID = -31423114176472743L;
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private Integer roleId;
    
    private Integer deptId;
    
    private Integer gender;
    
    private String email;
    
    private String mobile;
    
    private Date birthday;
    
    private String state;
    
    private String remark;
    
    private String headImg;

    private Dept dept;

    private Role role;


}