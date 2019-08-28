package com.kualalumpur.basic.redis;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/28 1:31
 **/
public class TesterKey extends BasePrefix{
    private TesterKey(String prefix){
        super(prefix);
    }
    public static TesterKey getByName = new TesterKey("kualalumpur");
}
