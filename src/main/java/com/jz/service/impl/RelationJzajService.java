package com.jz.service.impl;

import com.jz.dao.RelationJzajMapper;
import com.jz.model.RelationJzaj;
import com.jz.service.IRelationJzajService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service("relationJzajService")
public class RelationJzajService implements IRelationJzajService {
    private static final Logger logger = LoggerFactory.getLogger(RelationJzajService.class);

    @Autowired
    private RelationJzajMapper relationJzajMapper;


    public void batchRelationJzaj(List<RelationJzaj> relationJzajs){
        if(relationJzajs!=null&&relationJzajs.size()>0){
            logger.info("excute");
            for (RelationJzaj item : relationJzajs){
                if(relationJzajMapper.selectByPrimaryKey(item.getAjbh())==null){
                    relationJzajMapper.insert(item);
                }
            }
        }
    }

}
