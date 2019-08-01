package com.jz.control;

import com.jz.model.RelationJzaj;
import com.jz.service.impl.RelationJzajService;
import com.jz.serviceUtil.WbfwQueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/relationJzaj")
public class RelationJzajController {

    private static final Logger logger = LoggerFactory.getLogger(RelationJzajController.class);

    @Autowired
    private RelationJzajService relationJzajService;

    @RequestMapping(value="/batchRelationJzaj", method = {RequestMethod.POST})
    @ResponseBody
    public String batchRelationJzaj(){

        try {
            WbfwQueryUtil.callDxyhdjzl();
        } catch (Exception e) {
            logger.error("batchRelationJzaj error",e);
            return e.getMessage();
        }

        List<RelationJzaj> relationJzajs=new ArrayList<RelationJzaj>();
        RelationJzaj relationJzaj=new RelationJzaj();
        relationJzaj.setAjbh("00000111");
        relationJzaj.setAjmc("哈哈");
        relationJzajs.add(relationJzaj);

        relationJzajService.batchRelationJzaj(relationJzajs);

        return "sucess";
    }


}
