package com.kualalumpur.basic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@ResponseBody
@Slf4j
public class TestController {

    @RequestMapping(value = "testAPI.do")
    public String testApi(){
        log.info("test 接口调用成功");
        return "/test/testAPI.do";
    }

}
