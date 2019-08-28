package com.kualalumpur.basic.controller;

import com.kualalumpur.basic.domain.Tester;
import com.kualalumpur.basic.result.Result;
import com.kualalumpur.basic.service.ITesterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
@ResponseBody
@Slf4j
public class TestController {

    @Autowired
    private ITesterService iTesterService;

    @RequestMapping(value = "testAPI.do")
    public String testApi(){
        log.info("test 接口调用成功");
        return "/test/testAPI.do";
    }
    //result json
    @RequestMapping(value="testResult.do")
    public Result testResult(){
        return Result.success();
    }
    //result json data
    @RequestMapping(value="testResultData.do")
    public Result testResultData(){
        return Result.success(Tester.createBean());
    }
    //mybatis druid
    @RequestMapping(value="testGetTesters.do")
    public Result testGetTesters(){
        List<Tester> testerList = iTesterService.getAllTester();
        return Result.success(testerList);
    }
    @RequestMapping(value = "testRedis.do")
    public Result testRedis(){

        iTesterService.setTester();

        return Result.success();
    }

}
