package com.jz.dao;

import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzajExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationJzajMapper {
    int countByExample(RelationJzajExample example);

    int deleteByExample(RelationJzajExample example);

    int deleteByPrimaryKey(String ajbh);

    int insert(RelationJzaj record);

    int insertSelective(RelationJzaj record);

    List<RelationJzaj> selectByExample(RelationJzajExample example);

    RelationJzaj selectByPrimaryKey(String ajbh);

    int updateByExampleSelective(@Param("record") RelationJzaj record, @Param("example") RelationJzajExample example);

    int updateByExample(@Param("record") RelationJzaj record, @Param("example") RelationJzajExample example);

    int updateByPrimaryKeySelective(RelationJzaj record);

    int updateByPrimaryKey(RelationJzaj record);
}