package com.kualalumpur.basic.service;

import com.kualalumpur.basic.domain.Tester;

import java.util.List;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/18 12:57
 **/
public interface ITesterService {
    List<Tester> getAllTester();
    void setTester();
}
