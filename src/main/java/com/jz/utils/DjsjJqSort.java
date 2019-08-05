package com.jz.utils;

import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;

import java.util.Comparator;

public class DjsjJqSort implements Comparator<RelationJzjq> {

    @Override
    public int compare(RelationJzjq o1, RelationJzjq o2) {
        Long compareInt=o2.getDjsj().getTime()-o1.getDjsj().getTime();
        return compareInt.intValue();
    }
}
