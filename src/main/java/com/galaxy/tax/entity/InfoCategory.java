package com.galaxy.tax.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxInfocategory)实体类
 *
 * @author makejava
 * @since 2020-05-25 16:24:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoCategory implements Serializable {
    private static final long serialVersionUID = -35161384426808787L;
    
    private Integer id;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}