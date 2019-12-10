package com.example.demo.control;

import com.example.demo.po.SqlDO;
import com.example.demo.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @author qinxingjie
 * @date 2019/12/6 12:06
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @NotNull
    @RequestMapping("/admin")
    public String getMessage(@Param("sql") String sql){
        SqlDO sqlDO = new SqlDO();
        sqlDO.setSql(sql);
        return testService.getMessage(sqlDO);
    }
}
