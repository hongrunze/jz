package com.jz.control;

import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;
import com.jz.service.impl.RelationJzjqService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/relationJzjq")
public class RelationJzjqController {

    private static final Logger logger = LoggerFactory.getLogger(RelationJzjqController.class);

    @Autowired
    private RelationJzjqService relationJzjqService;

    @RequestMapping(value="/batchRelationJzjq", method = {RequestMethod.POST})
    @ResponseBody
    public String batchRelationJzjq(){

        List<RelationJzjq> relationJzjqs=new ArrayList<RelationJzjq>();
        RelationJzjq relationJzaj=new RelationJzjq();
        relationJzaj.setJqbh("0000001");
        relationJzaj.setBjnr("sdffsdf");
        relationJzjqs.add(relationJzaj);
        relationJzjqService.batchRelationJzjq(relationJzjqs);

        return "sucess";
    }

}
