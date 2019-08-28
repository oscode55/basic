package com.kualalumpur.basic.result;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @Description 返回码 返回信息封装 装载返回实体 可以附带数据域
 * @Author KualaLumpur
 * @Date 2019/8/18 12:29
 **/
@JsonInclude(value = JsonInclude.Include.NON_NULL) //null不返回
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 成功时调用
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }
    //{code:0,msg:"success"}
    public static Result success(){
        return new Result();
    }
    /**
     * 失败时调用
     */
    //需要返回具体错误信息
    public static <T> Result<T> error(CodeMsg cm) {
        return new Result<T>(cm);
    }

    private Result(CodeMsg cm) {
        if (cm == null) return;
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }
    private Result(){
        this.code=0;
        this.msg="success";
    }
    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

}
