package com.personal.mock.dao;

import com.personal.mock.po.MockGroupApp;
import com.personal.mock.po.MockGroupAppQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MockGroupAppRepository {
    int countByExample(MockGroupAppQuery example);

    int deleteByExample(MockGroupAppQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockGroupApp record);

    int insertSelective(MockGroupApp record);

    List<MockGroupApp> selectByExample(MockGroupAppQuery example);

    MockGroupApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockGroupApp record, @Param("example") MockGroupAppQuery example);

    int updateByExample(@Param("record") MockGroupApp record, @Param("example") MockGroupAppQuery example);

    int updateByPrimaryKeySelective(MockGroupApp record);

    int updateByPrimaryKey(MockGroupApp record);
}