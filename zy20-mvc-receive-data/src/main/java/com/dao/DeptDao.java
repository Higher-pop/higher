package com.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author SherWin
 * @date 2019/11/11 18:27
 */
public interface DeptDao {
    void insert(@Param("deptname")String deptname);
}
