package com.jz.dao;

import com.jz.model.RelationJzjq;
import com.jz.model.RelationJzjqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationJzjqMapper {
    int countByExample(RelationJzjqExample example);

    int deleteByExample(RelationJzjqExample example);

    int deleteByPrimaryKey(String jqbh);

    int insert(RelationJzjq record);

    int insertSelective(RelationJzjq record);

    List<RelationJzjq> selectByExample(RelationJzjqExample example);

    RelationJzjq selectByPrimaryKey(String jqbh);

    int updateByExampleSelective(@Param("record") RelationJzjq record, @Param("example") RelationJzjqExample example);

    int updateByExample(@Param("record") RelationJzjq record, @Param("example") RelationJzjqExample example);

    int updateByPrimaryKeySelective(RelationJzjq record);

    int updateByPrimaryKey(RelationJzjq record);
}