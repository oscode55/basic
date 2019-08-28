package com.kualalumpur.basic.domain;

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

    public Tester(){

    }

    public Tester(String name, int age, String address, Date registerTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.registerTime = registerTime;
    }

    //测试函数
    public static Tester createBean(){
        return new Tester("kuala",1,"klcc",new Date());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }



}
