package com.entity;

import com.custom.Prefix;
import com.custom.Suffix;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author SherWin
 * @date 2019/11/11 18:24
 */
public class DeptEntity {
    private Integer id;
//    @Prefix
//    @Suffix
    @NotBlank
    @NotEmpty
    @Size(min=3,max = 5)
    private String deptname;

    public DeptEntity() {
    }

    public DeptEntity(Integer id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
