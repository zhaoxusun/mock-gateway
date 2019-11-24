package com.personal.mock.dao;

import com.personal.mock.po.MockStrategy;
import com.personal.mock.po.MockStrategyQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MockStrategyRepository {
    int countByExample(MockStrategyQuery example);

    int deleteByExample(MockStrategyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockStrategy record);

    int insertSelective(MockStrategy record);

    List<MockStrategy> selectByExample(MockStrategyQuery example);

    MockStrategy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockStrategy record, @Param("example") MockStrategyQuery example);

    int updateByExample(@Param("record") MockStrategy record, @Param("example") MockStrategyQuery example);

    int updateByPrimaryKeySelective(MockStrategy record);

    int updateByPrimaryKey(MockStrategy record);
}