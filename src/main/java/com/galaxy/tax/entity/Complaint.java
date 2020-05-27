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
@TableName(resultMap = "ComplaintMap",excludeProperty = {"account","dept"})
public class Complaint implements Serializable {
    private static final long serialVersionUID = -31423114176472723L;
    @ExcelIgnore
    private Integer id;

    private String title;

    private String state;

    private Integer accountId;

    private Date createTime;

    private Integer deptId;

    private String useName;

    private String dealInfo;

    private String content;

    private Account account;

    private Dept dept;
}