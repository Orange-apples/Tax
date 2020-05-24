package com.galaxy.tax.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.executable.ValidateOnExecution;
import java.io.Serializable;
import java.util.Date;

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
    @ExcelIgnore
    private Integer id;

    @NotNull(message = "姓名不能为空！")
    @Length(min = 2,max = 10,message = "用户名最小2位，最大十位")
    private String name;

    @NotNull(message = "密码不能为空")
    @Length(min = 8,max = 16,message = "密码长度不合法")
    private String password;
    
    private Integer roleId;
    
    private Integer deptId;

    private Integer gender;

    @Email(message = "不是一个合法的邮箱")
    private String email;

    @Length(min = 11,max = 11,message = "手机号码不合法")
    private String mobile;

    @Past(message = "生日不合法")
    private Date birthday;
    
    private String state;
    
    private String remark;

    private String headImg;

    @ExcelIgnore
    private Dept dept;

    @ExcelIgnore
    private Role role;


}