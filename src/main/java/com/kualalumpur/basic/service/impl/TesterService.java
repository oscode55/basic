package com.kualalumpur.basic.service.impl;

import com.kualalumpur.basic.dao.TesterDao;
import com.kualalumpur.basic.domain.Tester;
import com.kualalumpur.basic.redis.RedisService;
import com.kualalumpur.basic.redis.TesterKey;
import com.kualalumpur.basic.service.ITesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/18 12:55
 **/
@Service("iTesterService")
public class TesterService implements ITesterService {

    @Autowired
    TesterDao testerDao;

    @Autowired
    RedisService redisService;


    @Override
    public List<Tester> getAllTester(){
        List<Tester> testerList = testerDao.selectAll();
        return testerList;
    }

    @Override
    public void setTester() {
        Tester bean = Tester.createBean();
        redisService.set(TesterKey.getByName,""+bean.getName(),bean);
    }

}
