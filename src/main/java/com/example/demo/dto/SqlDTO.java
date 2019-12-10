package com.example.demo.dto;

import com.example.demo.po.SqlDO;
import com.example.demo.po.TestDO;

import java.util.List;

/**
 * @author qinxingjie
 * @date 2019/12/10 15:50
 */
public interface SqlDTO {
    List<TestDO> getInfo(SqlDO sqlDO);
}
