package com.jz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelationJzajExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationJzajExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAjbhIsNull() {
            addCriterion("ajbh is null");
            return (Criteria) this;
        }

        public Criteria andAjbhIsNotNull() {
            addCriterion("ajbh is not null");
            return (Criteria) this;
        }

        public Criteria andAjbhEqualTo(String value) {
            addCriterion("ajbh =", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotEqualTo(String value) {
            addCriterion("ajbh <>", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhGreaterThan(String value) {
            addCriterion("ajbh >", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhGreaterThanOrEqualTo(String value) {
            addCriterion("ajbh >=", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLessThan(String value) {
            addCriterion("ajbh <", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLessThanOrEqualTo(String value) {
            addCriterion("ajbh <=", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLike(String value) {
            addCriterion("ajbh like", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotLike(String value) {
            addCriterion("ajbh not like", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhIn(List<String> values) {
            addCriterion("ajbh in", values, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotIn(List<String> values) {
            addCriterion("ajbh not in", values, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhBetween(String value1, String value2) {
            addCriterion("ajbh between", value1, value2, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotBetween(String value1, String value2) {
            addCriterion("ajbh not between", value1, value2, "ajbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhIsNull() {
            addCriterion("gljqbh is null");
            return (Criteria) this;
        }

        public Criteria andGljqbhIsNotNull() {
            addCriterion("gljqbh is not null");
            return (Criteria) this;
        }

        public Criteria andGljqbhEqualTo(String value) {
            addCriterion("gljqbh =", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhNotEqualTo(String value) {
            addCriterion("gljqbh <>", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhGreaterThan(String value) {
            addCriterion("gljqbh >", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhGreaterThanOrEqualTo(String value) {
            addCriterion("gljqbh >=", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhLessThan(String value) {
            addCriterion("gljqbh <", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhLessThanOrEqualTo(String value) {
            addCriterion("gljqbh <=", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhLike(String value) {
            addCriterion("gljqbh like", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhNotLike(String value) {
            addCriterion("gljqbh not like", value, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhIn(List<String> values) {
            addCriterion("gljqbh in", values, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhNotIn(List<String> values) {
            addCriterion("gljqbh not in", values, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhBetween(String value1, String value2) {
            addCriterion("gljqbh between", value1, value2, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andGljqbhNotBetween(String value1, String value2) {
            addCriterion("gljqbh not between", value1, value2, "gljqbh");
            return (Criteria) this;
        }

        public Criteria andAjmcIsNull() {
            addCriterion("ajmc is null");
            return (Criteria) this;
        }

        public Criteria andAjmcIsNotNull() {
            addCriterion("ajmc is not null");
            return (Criteria) this;
        }

        public Criteria andAjmcEqualTo(String value) {
            addCriterion("ajmc =", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotEqualTo(String value) {
            addCriterion("ajmc <>", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcGreaterThan(String value) {
            addCriterion("ajmc >", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcGreaterThanOrEqualTo(String value) {
            addCriterion("ajmc >=", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLessThan(String value) {
            addCriterion("ajmc <", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLessThanOrEqualTo(String value) {
            addCriterion("ajmc <=", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLike(String value) {
            addCriterion("ajmc like", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotLike(String value) {
            addCriterion("ajmc not like", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcIn(List<String> values) {
            addCriterion("ajmc in", values, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotIn(List<String> values) {
            addCriterion("ajmc not in", values, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcBetween(String value1, String value2) {
            addCriterion("ajmc between", value1, value2, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotBetween(String value1, String value2) {
            addCriterion("ajmc not between", value1, value2, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjlbIsNull() {
            addCriterion("ajlb is null");
            return (Criteria) this;
        }

        public Criteria andAjlbIsNotNull() {
            addCriterion("ajlb is not null");
            return (Criteria) this;
        }

        public Criteria andAjlbEqualTo(String value) {
            addCriterion("ajlb =", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotEqualTo(String value) {
            addCriterion("ajlb <>", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbGreaterThan(String value) {
            addCriterion("ajlb >", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbGreaterThanOrEqualTo(String value) {
            addCriterion("ajlb >=", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLessThan(String value) {
            addCriterion("ajlb <", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLessThanOrEqualTo(String value) {
            addCriterion("ajlb <=", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLike(String value) {
            addCriterion("ajlb like", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotLike(String value) {
            addCriterion("ajlb not like", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbIn(List<String> values) {
            addCriterion("ajlb in", values, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotIn(List<String> values) {
            addCriterion("ajlb not in", values, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbBetween(String value1, String value2) {
            addCriterion("ajlb between", value1, value2, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotBetween(String value1, String value2) {
            addCriterion("ajlb not between", value1, value2, "ajlb");
            return (Criteria) this;
        }

        public Criteria andSldwIsNull() {
            addCriterion("sldw is null");
            return (Criteria) this;
        }

        public Criteria andSldwIsNotNull() {
            addCriterion("sldw is not null");
            return (Criteria) this;
        }

        public Criteria andSldwEqualTo(String value) {
            addCriterion("sldw =", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwNotEqualTo(String value) {
            addCriterion("sldw <>", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwGreaterThan(String value) {
            addCriterion("sldw >", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwGreaterThanOrEqualTo(String value) {
            addCriterion("sldw >=", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwLessThan(String value) {
            addCriterion("sldw <", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwLessThanOrEqualTo(String value) {
            addCriterion("sldw <=", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwLike(String value) {
            addCriterion("sldw like", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwNotLike(String value) {
            addCriterion("sldw not like", value, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwIn(List<String> values) {
            addCriterion("sldw in", values, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwNotIn(List<String> values) {
            addCriterion("sldw not in", values, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwBetween(String value1, String value2) {
            addCriterion("sldw between", value1, value2, "sldw");
            return (Criteria) this;
        }

        public Criteria andSldwNotBetween(String value1, String value2) {
            addCriterion("sldw not between", value1, value2, "sldw");
            return (Criteria) this;
        }

        public Criteria andAfsjIsNull() {
            addCriterion("afsj is null");
            return (Criteria) this;
        }

        public Criteria andAfsjIsNotNull() {
            addCriterion("afsj is not null");
            return (Criteria) this;
        }

        public Criteria andAfsjEqualTo(String value) {
            addCriterion("afsj =", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjNotEqualTo(String value) {
            addCriterion("afsj <>", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjGreaterThan(String value) {
            addCriterion("afsj >", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjGreaterThanOrEqualTo(String value) {
            addCriterion("afsj >=", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjLessThan(String value) {
            addCriterion("afsj <", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjLessThanOrEqualTo(String value) {
            addCriterion("afsj <=", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjLike(String value) {
            addCriterion("afsj like", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjNotLike(String value) {
            addCriterion("afsj not like", value, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjIn(List<String> values) {
            addCriterion("afsj in", values, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjNotIn(List<String> values) {
            addCriterion("afsj not in", values, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjBetween(String value1, String value2) {
            addCriterion("afsj between", value1, value2, "afsj");
            return (Criteria) this;
        }

        public Criteria andAfsjNotBetween(String value1, String value2) {
            addCriterion("afsj not between", value1, value2, "afsj");
            return (Criteria) this;
        }

        public Criteria andBaryIsNull() {
            addCriterion("bary is null");
            return (Criteria) this;
        }

        public Criteria andBaryIsNotNull() {
            addCriterion("bary is not null");
            return (Criteria) this;
        }

        public Criteria andBaryEqualTo(String value) {
            addCriterion("bary =", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryNotEqualTo(String value) {
            addCriterion("bary <>", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryGreaterThan(String value) {
            addCriterion("bary >", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryGreaterThanOrEqualTo(String value) {
            addCriterion("bary >=", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryLessThan(String value) {
            addCriterion("bary <", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryLessThanOrEqualTo(String value) {
            addCriterion("bary <=", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryLike(String value) {
            addCriterion("bary like", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryNotLike(String value) {
            addCriterion("bary not like", value, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryIn(List<String> values) {
            addCriterion("bary in", values, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryNotIn(List<String> values) {
            addCriterion("bary not in", values, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryBetween(String value1, String value2) {
            addCriterion("bary between", value1, value2, "bary");
            return (Criteria) this;
        }

        public Criteria andBaryNotBetween(String value1, String value2) {
            addCriterion("bary not between", value1, value2, "bary");
            return (Criteria) this;
        }

        public Criteria andSaryIsNull() {
            addCriterion("sary is null");
            return (Criteria) this;
        }

        public Criteria andSaryIsNotNull() {
            addCriterion("sary is not null");
            return (Criteria) this;
        }

        public Criteria andSaryEqualTo(String value) {
            addCriterion("sary =", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryNotEqualTo(String value) {
            addCriterion("sary <>", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryGreaterThan(String value) {
            addCriterion("sary >", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryGreaterThanOrEqualTo(String value) {
            addCriterion("sary >=", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryLessThan(String value) {
            addCriterion("sary <", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryLessThanOrEqualTo(String value) {
            addCriterion("sary <=", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryLike(String value) {
            addCriterion("sary like", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryNotLike(String value) {
            addCriterion("sary not like", value, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryIn(List<String> values) {
            addCriterion("sary in", values, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryNotIn(List<String> values) {
            addCriterion("sary not in", values, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryBetween(String value1, String value2) {
            addCriterion("sary between", value1, value2, "sary");
            return (Criteria) this;
        }

        public Criteria andSaryNotBetween(String value1, String value2) {
            addCriterion("sary not between", value1, value2, "sary");
            return (Criteria) this;
        }

        public Criteria andCjlbIsNull() {
            addCriterion("cjlb is null");
            return (Criteria) this;
        }

        public Criteria andCjlbIsNotNull() {
            addCriterion("cjlb is not null");
            return (Criteria) this;
        }

        public Criteria andCjlbEqualTo(String value) {
            addCriterion("cjlb =", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbNotEqualTo(String value) {
            addCriterion("cjlb <>", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbGreaterThan(String value) {
            addCriterion("cjlb >", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbGreaterThanOrEqualTo(String value) {
            addCriterion("cjlb >=", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbLessThan(String value) {
            addCriterion("cjlb <", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbLessThanOrEqualTo(String value) {
            addCriterion("cjlb <=", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbLike(String value) {
            addCriterion("cjlb like", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbNotLike(String value) {
            addCriterion("cjlb not like", value, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbIn(List<String> values) {
            addCriterion("cjlb in", values, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbNotIn(List<String> values) {
            addCriterion("cjlb not in", values, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbBetween(String value1, String value2) {
            addCriterion("cjlb between", value1, value2, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjlbNotBetween(String value1, String value2) {
            addCriterion("cjlb not between", value1, value2, "cjlb");
            return (Criteria) this;
        }

        public Criteria andCjrbhIsNull() {
            addCriterion("cjrbh is null");
            return (Criteria) this;
        }

        public Criteria andCjrbhIsNotNull() {
            addCriterion("cjrbh is not null");
            return (Criteria) this;
        }

        public Criteria andCjrbhEqualTo(String value) {
            addCriterion("cjrbh =", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhNotEqualTo(String value) {
            addCriterion("cjrbh <>", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhGreaterThan(String value) {
            addCriterion("cjrbh >", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhGreaterThanOrEqualTo(String value) {
            addCriterion("cjrbh >=", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhLessThan(String value) {
            addCriterion("cjrbh <", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhLessThanOrEqualTo(String value) {
            addCriterion("cjrbh <=", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhLike(String value) {
            addCriterion("cjrbh like", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhNotLike(String value) {
            addCriterion("cjrbh not like", value, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhIn(List<String> values) {
            addCriterion("cjrbh in", values, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhNotIn(List<String> values) {
            addCriterion("cjrbh not in", values, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhBetween(String value1, String value2) {
            addCriterion("cjrbh between", value1, value2, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrbhNotBetween(String value1, String value2) {
            addCriterion("cjrbh not between", value1, value2, "cjrbh");
            return (Criteria) this;
        }

        public Criteria andCjrxmIsNull() {
            addCriterion("cjrxm is null");
            return (Criteria) this;
        }

        public Criteria andCjrxmIsNotNull() {
            addCriterion("cjrxm is not null");
            return (Criteria) this;
        }

        public Criteria andCjrxmEqualTo(String value) {
            addCriterion("cjrxm =", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmNotEqualTo(String value) {
            addCriterion("cjrxm <>", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmGreaterThan(String value) {
            addCriterion("cjrxm >", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmGreaterThanOrEqualTo(String value) {
            addCriterion("cjrxm >=", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmLessThan(String value) {
            addCriterion("cjrxm <", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmLessThanOrEqualTo(String value) {
            addCriterion("cjrxm <=", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmLike(String value) {
            addCriterion("cjrxm like", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmNotLike(String value) {
            addCriterion("cjrxm not like", value, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmIn(List<String> values) {
            addCriterion("cjrxm in", values, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmNotIn(List<String> values) {
            addCriterion("cjrxm not in", values, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmBetween(String value1, String value2) {
            addCriterion("cjrxm between", value1, value2, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjrxmNotBetween(String value1, String value2) {
            addCriterion("cjrxm not between", value1, value2, "cjrxm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmIsNull() {
            addCriterion("cjdwbm is null");
            return (Criteria) this;
        }

        public Criteria andCjdwbmIsNotNull() {
            addCriterion("cjdwbm is not null");
            return (Criteria) this;
        }

        public Criteria andCjdwbmEqualTo(String value) {
            addCriterion("cjdwbm =", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmNotEqualTo(String value) {
            addCriterion("cjdwbm <>", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmGreaterThan(String value) {
            addCriterion("cjdwbm >", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmGreaterThanOrEqualTo(String value) {
            addCriterion("cjdwbm >=", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmLessThan(String value) {
            addCriterion("cjdwbm <", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmLessThanOrEqualTo(String value) {
            addCriterion("cjdwbm <=", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmLike(String value) {
            addCriterion("cjdwbm like", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmNotLike(String value) {
            addCriterion("cjdwbm not like", value, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmIn(List<String> values) {
            addCriterion("cjdwbm in", values, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmNotIn(List<String> values) {
            addCriterion("cjdwbm not in", values, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmBetween(String value1, String value2) {
            addCriterion("cjdwbm between", value1, value2, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwbmNotBetween(String value1, String value2) {
            addCriterion("cjdwbm not between", value1, value2, "cjdwbm");
            return (Criteria) this;
        }

        public Criteria andCjdwmcIsNull() {
            addCriterion("cjdwmc is null");
            return (Criteria) this;
        }

        public Criteria andCjdwmcIsNotNull() {
            addCriterion("cjdwmc is not null");
            return (Criteria) this;
        }

        public Criteria andCjdwmcEqualTo(String value) {
            addCriterion("cjdwmc =", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcNotEqualTo(String value) {
            addCriterion("cjdwmc <>", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcGreaterThan(String value) {
            addCriterion("cjdwmc >", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("cjdwmc >=", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcLessThan(String value) {
            addCriterion("cjdwmc <", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcLessThanOrEqualTo(String value) {
            addCriterion("cjdwmc <=", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcLike(String value) {
            addCriterion("cjdwmc like", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcNotLike(String value) {
            addCriterion("cjdwmc not like", value, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcIn(List<String> values) {
            addCriterion("cjdwmc in", values, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcNotIn(List<String> values) {
            addCriterion("cjdwmc not in", values, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcBetween(String value1, String value2) {
            addCriterion("cjdwmc between", value1, value2, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjdwmcNotBetween(String value1, String value2) {
            addCriterion("cjdwmc not between", value1, value2, "cjdwmc");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("cjsj like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("cjsj not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andAfdiIsNull() {
            addCriterion("afdi is null");
            return (Criteria) this;
        }

        public Criteria andAfdiIsNotNull() {
            addCriterion("afdi is not null");
            return (Criteria) this;
        }

        public Criteria andAfdiEqualTo(String value) {
            addCriterion("afdi =", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiNotEqualTo(String value) {
            addCriterion("afdi <>", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiGreaterThan(String value) {
            addCriterion("afdi >", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiGreaterThanOrEqualTo(String value) {
            addCriterion("afdi >=", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiLessThan(String value) {
            addCriterion("afdi <", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiLessThanOrEqualTo(String value) {
            addCriterion("afdi <=", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiLike(String value) {
            addCriterion("afdi like", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiNotLike(String value) {
            addCriterion("afdi not like", value, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiIn(List<String> values) {
            addCriterion("afdi in", values, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiNotIn(List<String> values) {
            addCriterion("afdi not in", values, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiBetween(String value1, String value2) {
            addCriterion("afdi between", value1, value2, "afdi");
            return (Criteria) this;
        }

        public Criteria andAfdiNotBetween(String value1, String value2) {
            addCriterion("afdi not between", value1, value2, "afdi");
            return (Criteria) this;
        }

        public Criteria andCljqnrIsNull() {
            addCriterion("cljqnr is null");
            return (Criteria) this;
        }

        public Criteria andCljqnrIsNotNull() {
            addCriterion("cljqnr is not null");
            return (Criteria) this;
        }

        public Criteria andCljqnrEqualTo(String value) {
            addCriterion("cljqnr =", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrNotEqualTo(String value) {
            addCriterion("cljqnr <>", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrGreaterThan(String value) {
            addCriterion("cljqnr >", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrGreaterThanOrEqualTo(String value) {
            addCriterion("cljqnr >=", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrLessThan(String value) {
            addCriterion("cljqnr <", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrLessThanOrEqualTo(String value) {
            addCriterion("cljqnr <=", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrLike(String value) {
            addCriterion("cljqnr like", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrNotLike(String value) {
            addCriterion("cljqnr not like", value, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrIn(List<String> values) {
            addCriterion("cljqnr in", values, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrNotIn(List<String> values) {
            addCriterion("cljqnr not in", values, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrBetween(String value1, String value2) {
            addCriterion("cljqnr between", value1, value2, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andCljqnrNotBetween(String value1, String value2) {
            addCriterion("cljqnr not between", value1, value2, "cljqnr");
            return (Criteria) this;
        }

        public Criteria andGlspIsNull() {
            addCriterion("glsp is null");
            return (Criteria) this;
        }

        public Criteria andGlspIsNotNull() {
            addCriterion("glsp is not null");
            return (Criteria) this;
        }

        public Criteria andGlspEqualTo(String value) {
            addCriterion("glsp =", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspNotEqualTo(String value) {
            addCriterion("glsp <>", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspGreaterThan(String value) {
            addCriterion("glsp >", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspGreaterThanOrEqualTo(String value) {
            addCriterion("glsp >=", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspLessThan(String value) {
            addCriterion("glsp <", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspLessThanOrEqualTo(String value) {
            addCriterion("glsp <=", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspLike(String value) {
            addCriterion("glsp like", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspNotLike(String value) {
            addCriterion("glsp not like", value, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspIn(List<String> values) {
            addCriterion("glsp in", values, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspNotIn(List<String> values) {
            addCriterion("glsp not in", values, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspBetween(String value1, String value2) {
            addCriterion("glsp between", value1, value2, "glsp");
            return (Criteria) this;
        }

        public Criteria andGlspNotBetween(String value1, String value2) {
            addCriterion("glsp not between", value1, value2, "glsp");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("inserttime is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("inserttime is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("inserttime =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("inserttime <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("inserttime >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inserttime >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("inserttime <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("inserttime <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("inserttime in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("inserttime not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("inserttime between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("inserttime not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andGlgsIsNull() {
            addCriterion("glgs is null");
            return (Criteria) this;
        }

        public Criteria andGlgsIsNotNull() {
            addCriterion("glgs is not null");
            return (Criteria) this;
        }

        public Criteria andGlgsEqualTo(Integer value) {
            addCriterion("glgs =", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsNotEqualTo(Integer value) {
            addCriterion("glgs <>", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsGreaterThan(Integer value) {
            addCriterion("glgs >", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("glgs >=", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsLessThan(Integer value) {
            addCriterion("glgs <", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsLessThanOrEqualTo(Integer value) {
            addCriterion("glgs <=", value, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsIn(List<Integer> values) {
            addCriterion("glgs in", values, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsNotIn(List<Integer> values) {
            addCriterion("glgs not in", values, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsBetween(Integer value1, Integer value2) {
            addCriterion("glgs between", value1, value2, "glgs");
            return (Criteria) this;
        }

        public Criteria andGlgsNotBetween(Integer value1, Integer value2) {
            addCriterion("glgs not between", value1, value2, "glgs");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}