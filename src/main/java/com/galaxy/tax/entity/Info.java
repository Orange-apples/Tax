package com.galaxy.tax.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Info)实体类
 *
 * @author makejava
 * @since 2020-05-25 15:32:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(excludeProperty = {"account","category"},resultMap = "InfoMap")
public class Info implements Serializable {
    private static final long serialVersionUID = -30902271546451530L;
    
    private Integer id;
    
    private String refer;
    
    private Integer categoryId;
    
    private String title;
    
    private String content;
    
    private String remark;
    
    private Integer accountId;
    
    private Date createTime;

    private String state;

    private Account account;

    private InfoCategory category;


}