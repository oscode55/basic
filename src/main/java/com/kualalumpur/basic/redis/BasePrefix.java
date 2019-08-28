package com.kualalumpur.basic.redis;

/**
 * @Description 基类(过期时间,缓存名称串的头部)
 * @Author KualaLumpur
 * @Date 2019/8/28 1:26
 **/
public class BasePrefix implements KeyPrefix{
    private int expireSeconds;
    private String prefix;

    public BasePrefix() {
    }

    public BasePrefix(String prefix) {
        this(0,prefix);//0代表永久有效
    }

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    @Override
    public int expireSecond() {
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":"+prefix;
    }
}
