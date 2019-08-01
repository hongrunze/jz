package com.jz.service.impl;

import com.jz.dao.RelationJzajMapper;
import com.jz.dao.RelationJzjqMapper;
import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;
import com.jz.service.IRelationJzjqService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service("relationJzjqService")
public class RelationJzjqService implements IRelationJzjqService {
    private static final Logger logger = LoggerFactory.getLogger(RelationJzjqService.class);

    @Autowired
    private RelationJzjqMapper relationJzjqMapper;

    public void batchRelationJzjq(List<RelationJzjq> relationJzjqs){
        if(!CollectionUtils.isEmpty(relationJzjqs)){
            logger.info("excute");
            for (RelationJzjq item : relationJzjqs){
                if(relationJzjqMapper.selectByPrimaryKey(item.getJqbh())==null){
                    relationJzjqMapper.insert(item);
                }
            }
        }
    }

}
