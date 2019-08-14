package com.kualalumpur.basic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @Description 测试实体
 * @Author KualaLumpur
 * @Date 2019/7/31 0:06
 **/
@JsonIgnoreProperties({"address"})
public class Tester {

    private String name;
    private int age;

    //家庭住址
    @JsonIgnore //序列化时忽略这个字段
    private String address;

    @JsonProperty("rt")  //返回json数据中键是"rt"
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") //日期格式化
    private Date registerTime;


}
