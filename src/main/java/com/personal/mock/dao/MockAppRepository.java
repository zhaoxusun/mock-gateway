package com.personal.mock.dao;

import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MockAppRepository {
    int countByExample(MockAppQuery example);

    int deleteByExample(MockAppQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockApp record);

    int insertSelective(MockApp record);

    List<MockApp> selectByExample(MockAppQuery example);

    MockApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockApp record, @Param("example") MockAppQuery example);

    int updateByExample(@Param("record") MockApp record, @Param("example") MockAppQuery example);

    int updateByPrimaryKeySelective(MockApp record);

    int updateByPrimaryKey(MockApp record);
}