package com.personal.mock.dao;

import com.personal.mock.po.MockAppStrategy;
import com.personal.mock.po.MockAppStrategyQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MockAppStrategyRepository {
    int countByExample(MockAppStrategyQuery example);

    int deleteByExample(MockAppStrategyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockAppStrategy record);

    int insertSelective(MockAppStrategy record);

    List<MockAppStrategy> selectByExample(MockAppStrategyQuery example);

    MockAppStrategy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockAppStrategy record, @Param("example") MockAppStrategyQuery example);

    int updateByExample(@Param("record") MockAppStrategy record, @Param("example") MockAppStrategyQuery example);

    int updateByPrimaryKeySelective(MockAppStrategy record);

    int updateByPrimaryKey(MockAppStrategy record);
}