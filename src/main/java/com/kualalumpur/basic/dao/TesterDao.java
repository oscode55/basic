package com.kualalumpur.basic.dao;

import com.kualalumpur.basic.domain.Tester;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/18 12:56
 **/
@Mapper
public interface TesterDao {
    @Select("SELECT * FROM tester")
    List<Tester> selectAll();
}
