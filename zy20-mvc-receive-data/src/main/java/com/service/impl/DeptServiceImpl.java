package com.service.impl;

import com.dao.DeptDao;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SherWin
 * @date 2019/11/11 18:34
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public void insert(String deptname) {
        deptDao.insert(deptname);
    }
}
