package com.jz.utils;

import com.jz.model.RelationJzaj;
import com.jz.serviceUtil.WbfwQueryUtil;

import java.text.SimpleDateFormat;
import java.util.*;

public class DjsjSort implements Comparator<RelationJzaj> {

    @Override
    public int compare(RelationJzaj o1, RelationJzaj o2) {
        Long compareInt=o2.getDjsj().getTime()-o1.getDjsj().getTime();
        return compareInt.intValue();
    }

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<RelationJzaj> relationJzajs= new ArrayList<RelationJzaj>();

        for(int i=0;i<60;i++){
            String dateStr="2019-08-03 10:13:";
            if(i<10){
                dateStr=dateStr+"0"+i;
            }else{
                dateStr=dateStr+i;
            }

            RelationJzaj model=new RelationJzaj();
            try{
                model.setDjsj(simpleDateFormat.parse(dateStr));
            }catch (Exception ex){
                ex.printStackTrace();
            }
            model.setAjmc("强奸案"+i);
            model.setAjbh("编号"+i);
            relationJzajs.add(model);
        }

        Collections.sort(relationJzajs,new DjsjSort());

        for(int i=0;i<60;i++){
            System.out.println(relationJzajs.get(i).getAjbh()+"\t"+relationJzajs.get(i).getAjmc()+"\t"+simpleDateFormat.format(relationJzajs.get(i).getDjsj()));
        }
    }
}
