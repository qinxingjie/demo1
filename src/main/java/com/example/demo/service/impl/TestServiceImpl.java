package com.example.demo.service.impl;

import com.example.demo.dto.SqlDTO;
import com.example.demo.dto.TestDTO;
import com.example.demo.po.SqlDO;
import com.example.demo.po.TestDO;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinxingjie
 * @date 2019/12/6 12:04
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDTO testDTO;

    @Autowired
    SqlDTO sqlDTO;

    @Override
    public String getMessage(SqlDO sqlDO) {
        TestDO testDO = new TestDO();
        testDO.setId(231);
        testDO.setDetail("detail");
        return sqlDTO.getInfo(sqlDO).toString();
    }
}
