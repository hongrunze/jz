package com.jz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelationJzjqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationJzjqExample() {
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

        public Criteria andJqbhIsNull() {
            addCriterion("jqbh is null");
            return (Criteria) this;
        }

        public Criteria andJqbhIsNotNull() {
            addCriterion("jqbh is not null");
            return (Criteria) this;
        }

        public Criteria andJqbhEqualTo(String value) {
            addCriterion("jqbh =", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhNotEqualTo(String value) {
            addCriterion("jqbh <>", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhGreaterThan(String value) {
            addCriterion("jqbh >", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhGreaterThanOrEqualTo(String value) {
            addCriterion("jqbh >=", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhLessThan(String value) {
            addCriterion("jqbh <", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhLessThanOrEqualTo(String value) {
            addCriterion("jqbh <=", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhLike(String value) {
            addCriterion("jqbh like", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhNotLike(String value) {
            addCriterion("jqbh not like", value, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhIn(List<String> values) {
            addCriterion("jqbh in", values, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhNotIn(List<String> values) {
            addCriterion("jqbh not in", values, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhBetween(String value1, String value2) {
            addCriterion("jqbh between", value1, value2, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqbhNotBetween(String value1, String value2) {
            addCriterion("jqbh not between", value1, value2, "jqbh");
            return (Criteria) this;
        }

        public Criteria andJqlbIsNull() {
            addCriterion("jqlb is null");
            return (Criteria) this;
        }

        public Criteria andJqlbIsNotNull() {
            addCriterion("jqlb is not null");
            return (Criteria) this;
        }

        public Criteria andJqlbEqualTo(String value) {
            addCriterion("jqlb =", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbNotEqualTo(String value) {
            addCriterion("jqlb <>", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbGreaterThan(String value) {
            addCriterion("jqlb >", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbGreaterThanOrEqualTo(String value) {
            addCriterion("jqlb >=", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbLessThan(String value) {
            addCriterion("jqlb <", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbLessThanOrEqualTo(String value) {
            addCriterion("jqlb <=", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbLike(String value) {
            addCriterion("jqlb like", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbNotLike(String value) {
            addCriterion("jqlb not like", value, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbIn(List<String> values) {
            addCriterion("jqlb in", values, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbNotIn(List<String> values) {
            addCriterion("jqlb not in", values, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbBetween(String value1, String value2) {
            addCriterion("jqlb between", value1, value2, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlbNotBetween(String value1, String value2) {
            addCriterion("jqlb not between", value1, value2, "jqlb");
            return (Criteria) this;
        }

        public Criteria andJqlyIsNull() {
            addCriterion("jqly is null");
            return (Criteria) this;
        }

        public Criteria andJqlyIsNotNull() {
            addCriterion("jqly is not null");
            return (Criteria) this;
        }

        public Criteria andJqlyEqualTo(String value) {
            addCriterion("jqly =", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyNotEqualTo(String value) {
            addCriterion("jqly <>", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyGreaterThan(String value) {
            addCriterion("jqly >", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyGreaterThanOrEqualTo(String value) {
            addCriterion("jqly >=", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyLessThan(String value) {
            addCriterion("jqly <", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyLessThanOrEqualTo(String value) {
            addCriterion("jqly <=", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyLike(String value) {
            addCriterion("jqly like", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyNotLike(String value) {
            addCriterion("jqly not like", value, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyIn(List<String> values) {
            addCriterion("jqly in", values, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyNotIn(List<String> values) {
            addCriterion("jqly not in", values, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyBetween(String value1, String value2) {
            addCriterion("jqly between", value1, value2, "jqly");
            return (Criteria) this;
        }

        public Criteria andJqlyNotBetween(String value1, String value2) {
            addCriterion("jqly not between", value1, value2, "jqly");
            return (Criteria) this;
        }

        public Criteria andBjlxIsNull() {
            addCriterion("bjlx is null");
            return (Criteria) this;
        }

        public Criteria andBjlxIsNotNull() {
            addCriterion("bjlx is not null");
            return (Criteria) this;
        }

        public Criteria andBjlxEqualTo(String value) {
            addCriterion("bjlx =", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotEqualTo(String value) {
            addCriterion("bjlx <>", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxGreaterThan(String value) {
            addCriterion("bjlx >", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxGreaterThanOrEqualTo(String value) {
            addCriterion("bjlx >=", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLessThan(String value) {
            addCriterion("bjlx <", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLessThanOrEqualTo(String value) {
            addCriterion("bjlx <=", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLike(String value) {
            addCriterion("bjlx like", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotLike(String value) {
            addCriterion("bjlx not like", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxIn(List<String> values) {
            addCriterion("bjlx in", values, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotIn(List<String> values) {
            addCriterion("bjlx not in", values, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxBetween(String value1, String value2) {
            addCriterion("bjlx between", value1, value2, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotBetween(String value1, String value2) {
            addCriterion("bjlx not between", value1, value2, "bjlx");
            return (Criteria) this;
        }

        public Criteria andCjbsIsNull() {
            addCriterion("cjbs is null");
            return (Criteria) this;
        }

        public Criteria andCjbsIsNotNull() {
            addCriterion("cjbs is not null");
            return (Criteria) this;
        }

        public Criteria andCjbsEqualTo(String value) {
            addCriterion("cjbs =", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotEqualTo(String value) {
            addCriterion("cjbs <>", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsGreaterThan(String value) {
            addCriterion("cjbs >", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsGreaterThanOrEqualTo(String value) {
            addCriterion("cjbs >=", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLessThan(String value) {
            addCriterion("cjbs <", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLessThanOrEqualTo(String value) {
            addCriterion("cjbs <=", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLike(String value) {
            addCriterion("cjbs like", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotLike(String value) {
            addCriterion("cjbs not like", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsIn(List<String> values) {
            addCriterion("cjbs in", values, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotIn(List<String> values) {
            addCriterion("cjbs not in", values, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsBetween(String value1, String value2) {
            addCriterion("cjbs between", value1, value2, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotBetween(String value1, String value2) {
            addCriterion("cjbs not between", value1, value2, "cjbs");
            return (Criteria) this;
        }

        public Criteria andGlajIsNull() {
            addCriterion("glaj is null");
            return (Criteria) this;
        }

        public Criteria andGlajIsNotNull() {
            addCriterion("glaj is not null");
            return (Criteria) this;
        }

        public Criteria andGlajEqualTo(String value) {
            addCriterion("glaj =", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajNotEqualTo(String value) {
            addCriterion("glaj <>", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajGreaterThan(String value) {
            addCriterion("glaj >", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajGreaterThanOrEqualTo(String value) {
            addCriterion("glaj >=", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajLessThan(String value) {
            addCriterion("glaj <", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajLessThanOrEqualTo(String value) {
            addCriterion("glaj <=", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajLike(String value) {
            addCriterion("glaj like", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajNotLike(String value) {
            addCriterion("glaj not like", value, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajIn(List<String> values) {
            addCriterion("glaj in", values, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajNotIn(List<String> values) {
            addCriterion("glaj not in", values, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajBetween(String value1, String value2) {
            addCriterion("glaj between", value1, value2, "glaj");
            return (Criteria) this;
        }

        public Criteria andGlajNotBetween(String value1, String value2) {
            addCriterion("glaj not between", value1, value2, "glaj");
            return (Criteria) this;
        }

        public Criteria andJjrbhIsNull() {
            addCriterion("jjrbh is null");
            return (Criteria) this;
        }

        public Criteria andJjrbhIsNotNull() {
            addCriterion("jjrbh is not null");
            return (Criteria) this;
        }

        public Criteria andJjrbhEqualTo(String value) {
            addCriterion("jjrbh =", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhNotEqualTo(String value) {
            addCriterion("jjrbh <>", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhGreaterThan(String value) {
            addCriterion("jjrbh >", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhGreaterThanOrEqualTo(String value) {
            addCriterion("jjrbh >=", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhLessThan(String value) {
            addCriterion("jjrbh <", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhLessThanOrEqualTo(String value) {
            addCriterion("jjrbh <=", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhLike(String value) {
            addCriterion("jjrbh like", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhNotLike(String value) {
            addCriterion("jjrbh not like", value, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhIn(List<String> values) {
            addCriterion("jjrbh in", values, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhNotIn(List<String> values) {
            addCriterion("jjrbh not in", values, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhBetween(String value1, String value2) {
            addCriterion("jjrbh between", value1, value2, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrbhNotBetween(String value1, String value2) {
            addCriterion("jjrbh not between", value1, value2, "jjrbh");
            return (Criteria) this;
        }

        public Criteria andJjrxmIsNull() {
            addCriterion("jjrxm is null");
            return (Criteria) this;
        }

        public Criteria andJjrxmIsNotNull() {
            addCriterion("jjrxm is not null");
            return (Criteria) this;
        }

        public Criteria andJjrxmEqualTo(String value) {
            addCriterion("jjrxm =", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotEqualTo(String value) {
            addCriterion("jjrxm <>", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmGreaterThan(String value) {
            addCriterion("jjrxm >", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmGreaterThanOrEqualTo(String value) {
            addCriterion("jjrxm >=", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLessThan(String value) {
            addCriterion("jjrxm <", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLessThanOrEqualTo(String value) {
            addCriterion("jjrxm <=", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLike(String value) {
            addCriterion("jjrxm like", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotLike(String value) {
            addCriterion("jjrxm not like", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmIn(List<String> values) {
            addCriterion("jjrxm in", values, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotIn(List<String> values) {
            addCriterion("jjrxm not in", values, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmBetween(String value1, String value2) {
            addCriterion("jjrxm between", value1, value2, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotBetween(String value1, String value2) {
            addCriterion("jjrxm not between", value1, value2, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andBjrIsNull() {
            addCriterion("bjr is null");
            return (Criteria) this;
        }

        public Criteria andBjrIsNotNull() {
            addCriterion("bjr is not null");
            return (Criteria) this;
        }

        public Criteria andBjrEqualTo(String value) {
            addCriterion("bjr =", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotEqualTo(String value) {
            addCriterion("bjr <>", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrGreaterThan(String value) {
            addCriterion("bjr >", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrGreaterThanOrEqualTo(String value) {
            addCriterion("bjr >=", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLessThan(String value) {
            addCriterion("bjr <", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLessThanOrEqualTo(String value) {
            addCriterion("bjr <=", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLike(String value) {
            addCriterion("bjr like", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotLike(String value) {
            addCriterion("bjr not like", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrIn(List<String> values) {
            addCriterion("bjr in", values, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotIn(List<String> values) {
            addCriterion("bjr not in", values, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrBetween(String value1, String value2) {
            addCriterion("bjr between", value1, value2, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotBetween(String value1, String value2) {
            addCriterion("bjr not between", value1, value2, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNull() {
            addCriterion("bjnr is null");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNotNull() {
            addCriterion("bjnr is not null");
            return (Criteria) this;
        }

        public Criteria andBjnrEqualTo(String value) {
            addCriterion("bjnr =", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotEqualTo(String value) {
            addCriterion("bjnr <>", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThan(String value) {
            addCriterion("bjnr >", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThanOrEqualTo(String value) {
            addCriterion("bjnr >=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThan(String value) {
            addCriterion("bjnr <", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThanOrEqualTo(String value) {
            addCriterion("bjnr <=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLike(String value) {
            addCriterion("bjnr like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotLike(String value) {
            addCriterion("bjnr not like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrIn(List<String> values) {
            addCriterion("bjnr in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotIn(List<String> values) {
            addCriterion("bjnr not in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrBetween(String value1, String value2) {
            addCriterion("bjnr between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotBetween(String value1, String value2) {
            addCriterion("bjnr not between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andSfddIsNull() {
            addCriterion("sfdd is null");
            return (Criteria) this;
        }

        public Criteria andSfddIsNotNull() {
            addCriterion("sfdd is not null");
            return (Criteria) this;
        }

        public Criteria andSfddEqualTo(String value) {
            addCriterion("sfdd =", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotEqualTo(String value) {
            addCriterion("sfdd <>", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddGreaterThan(String value) {
            addCriterion("sfdd >", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddGreaterThanOrEqualTo(String value) {
            addCriterion("sfdd >=", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLessThan(String value) {
            addCriterion("sfdd <", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLessThanOrEqualTo(String value) {
            addCriterion("sfdd <=", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLike(String value) {
            addCriterion("sfdd like", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotLike(String value) {
            addCriterion("sfdd not like", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddIn(List<String> values) {
            addCriterion("sfdd in", values, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotIn(List<String> values) {
            addCriterion("sfdd not in", values, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddBetween(String value1, String value2) {
            addCriterion("sfdd between", value1, value2, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotBetween(String value1, String value2) {
            addCriterion("sfdd not between", value1, value2, "sfdd");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("lxdh is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("lxdh =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("lxdh <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("lxdh >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxdh >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("lxdh <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("lxdh <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("lxdh like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("lxdh not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("lxdh in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("lxdh not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("lxdh between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("lxdh not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andBjrdzIsNull() {
            addCriterion("bjrdz is null");
            return (Criteria) this;
        }

        public Criteria andBjrdzIsNotNull() {
            addCriterion("bjrdz is not null");
            return (Criteria) this;
        }

        public Criteria andBjrdzEqualTo(String value) {
            addCriterion("bjrdz =", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzNotEqualTo(String value) {
            addCriterion("bjrdz <>", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzGreaterThan(String value) {
            addCriterion("bjrdz >", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzGreaterThanOrEqualTo(String value) {
            addCriterion("bjrdz >=", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzLessThan(String value) {
            addCriterion("bjrdz <", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzLessThanOrEqualTo(String value) {
            addCriterion("bjrdz <=", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzLike(String value) {
            addCriterion("bjrdz like", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzNotLike(String value) {
            addCriterion("bjrdz not like", value, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzIn(List<String> values) {
            addCriterion("bjrdz in", values, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzNotIn(List<String> values) {
            addCriterion("bjrdz not in", values, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzBetween(String value1, String value2) {
            addCriterion("bjrdz between", value1, value2, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andBjrdzNotBetween(String value1, String value2) {
            addCriterion("bjrdz not between", value1, value2, "bjrdz");
            return (Criteria) this;
        }

        public Criteria andJjdwIsNull() {
            addCriterion("jjdw is null");
            return (Criteria) this;
        }

        public Criteria andJjdwIsNotNull() {
            addCriterion("jjdw is not null");
            return (Criteria) this;
        }

        public Criteria andJjdwEqualTo(String value) {
            addCriterion("jjdw =", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotEqualTo(String value) {
            addCriterion("jjdw <>", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwGreaterThan(String value) {
            addCriterion("jjdw >", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwGreaterThanOrEqualTo(String value) {
            addCriterion("jjdw >=", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLessThan(String value) {
            addCriterion("jjdw <", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLessThanOrEqualTo(String value) {
            addCriterion("jjdw <=", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLike(String value) {
            addCriterion("jjdw like", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotLike(String value) {
            addCriterion("jjdw not like", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwIn(List<String> values) {
            addCriterion("jjdw in", values, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotIn(List<String> values) {
            addCriterion("jjdw not in", values, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwBetween(String value1, String value2) {
            addCriterion("jjdw between", value1, value2, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotBetween(String value1, String value2) {
            addCriterion("jjdw not between", value1, value2, "jjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwIsNull() {
            addCriterion("cjdw is null");
            return (Criteria) this;
        }

        public Criteria andCjdwIsNotNull() {
            addCriterion("cjdw is not null");
            return (Criteria) this;
        }

        public Criteria andCjdwEqualTo(String value) {
            addCriterion("cjdw =", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwNotEqualTo(String value) {
            addCriterion("cjdw <>", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwGreaterThan(String value) {
            addCriterion("cjdw >", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwGreaterThanOrEqualTo(String value) {
            addCriterion("cjdw >=", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwLessThan(String value) {
            addCriterion("cjdw <", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwLessThanOrEqualTo(String value) {
            addCriterion("cjdw <=", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwLike(String value) {
            addCriterion("cjdw like", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwNotLike(String value) {
            addCriterion("cjdw not like", value, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwIn(List<String> values) {
            addCriterion("cjdw in", values, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwNotIn(List<String> values) {
            addCriterion("cjdw not in", values, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwBetween(String value1, String value2) {
            addCriterion("cjdw between", value1, value2, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjdwNotBetween(String value1, String value2) {
            addCriterion("cjdw not between", value1, value2, "cjdw");
            return (Criteria) this;
        }

        public Criteria andCjmjIsNull() {
            addCriterion("cjmj is null");
            return (Criteria) this;
        }

        public Criteria andCjmjIsNotNull() {
            addCriterion("cjmj is not null");
            return (Criteria) this;
        }

        public Criteria andCjmjEqualTo(String value) {
            addCriterion("cjmj =", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjNotEqualTo(String value) {
            addCriterion("cjmj <>", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjGreaterThan(String value) {
            addCriterion("cjmj >", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjGreaterThanOrEqualTo(String value) {
            addCriterion("cjmj >=", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjLessThan(String value) {
            addCriterion("cjmj <", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjLessThanOrEqualTo(String value) {
            addCriterion("cjmj <=", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjLike(String value) {
            addCriterion("cjmj like", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjNotLike(String value) {
            addCriterion("cjmj not like", value, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjIn(List<String> values) {
            addCriterion("cjmj in", values, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjNotIn(List<String> values) {
            addCriterion("cjmj not in", values, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjBetween(String value1, String value2) {
            addCriterion("cjmj between", value1, value2, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjNotBetween(String value1, String value2) {
            addCriterion("cjmj not between", value1, value2, "cjmj");
            return (Criteria) this;
        }

        public Criteria andCjmjxmIsNull() {
            addCriterion("cjmjxm is null");
            return (Criteria) this;
        }

        public Criteria andCjmjxmIsNotNull() {
            addCriterion("cjmjxm is not null");
            return (Criteria) this;
        }

        public Criteria andCjmjxmEqualTo(String value) {
            addCriterion("cjmjxm =", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmNotEqualTo(String value) {
            addCriterion("cjmjxm <>", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmGreaterThan(String value) {
            addCriterion("cjmjxm >", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmGreaterThanOrEqualTo(String value) {
            addCriterion("cjmjxm >=", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmLessThan(String value) {
            addCriterion("cjmjxm <", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmLessThanOrEqualTo(String value) {
            addCriterion("cjmjxm <=", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmLike(String value) {
            addCriterion("cjmjxm like", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmNotLike(String value) {
            addCriterion("cjmjxm not like", value, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmIn(List<String> values) {
            addCriterion("cjmjxm in", values, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmNotIn(List<String> values) {
            addCriterion("cjmjxm not in", values, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmBetween(String value1, String value2) {
            addCriterion("cjmjxm between", value1, value2, "cjmjxm");
            return (Criteria) this;
        }

        public Criteria andCjmjxmNotBetween(String value1, String value2) {
            addCriterion("cjmjxm not between", value1, value2, "cjmjxm");
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

        public Criteria andBjdhsjIsNull() {
            addCriterion("bjdhsj is null");
            return (Criteria) this;
        }

        public Criteria andBjdhsjIsNotNull() {
            addCriterion("bjdhsj is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhsjEqualTo(Date value) {
            addCriterion("bjdhsj =", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotEqualTo(Date value) {
            addCriterion("bjdhsj <>", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjGreaterThan(Date value) {
            addCriterion("bjdhsj >", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjGreaterThanOrEqualTo(Date value) {
            addCriterion("bjdhsj >=", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjLessThan(Date value) {
            addCriterion("bjdhsj <", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjLessThanOrEqualTo(Date value) {
            addCriterion("bjdhsj <=", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjIn(List<Date> values) {
            addCriterion("bjdhsj in", values, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotIn(List<Date> values) {
            addCriterion("bjdhsj not in", values, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjBetween(Date value1, Date value2) {
            addCriterion("bjdhsj between", value1, value2, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotBetween(Date value1, Date value2) {
            addCriterion("bjdhsj not between", value1, value2, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIsNull() {
            addCriterion("jjrqsj is null");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIsNotNull() {
            addCriterion("jjrqsj is not null");
            return (Criteria) this;
        }

        public Criteria andJjrqsjEqualTo(Date value) {
            addCriterion("jjrqsj =", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotEqualTo(Date value) {
            addCriterion("jjrqsj <>", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjGreaterThan(Date value) {
            addCriterion("jjrqsj >", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjGreaterThanOrEqualTo(Date value) {
            addCriterion("jjrqsj >=", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjLessThan(Date value) {
            addCriterion("jjrqsj <", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjLessThanOrEqualTo(Date value) {
            addCriterion("jjrqsj <=", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIn(List<Date> values) {
            addCriterion("jjrqsj in", values, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotIn(List<Date> values) {
            addCriterion("jjrqsj not in", values, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjBetween(Date value1, Date value2) {
            addCriterion("jjrqsj between", value1, value2, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotBetween(Date value1, Date value2) {
            addCriterion("jjrqsj not between", value1, value2, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjIsNull() {
            addCriterion("ddxcsj is null");
            return (Criteria) this;
        }

        public Criteria andDdxcsjIsNotNull() {
            addCriterion("ddxcsj is not null");
            return (Criteria) this;
        }

        public Criteria andDdxcsjEqualTo(Date value) {
            addCriterion("ddxcsj =", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjNotEqualTo(Date value) {
            addCriterion("ddxcsj <>", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjGreaterThan(Date value) {
            addCriterion("ddxcsj >", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("ddxcsj >=", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjLessThan(Date value) {
            addCriterion("ddxcsj <", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjLessThanOrEqualTo(Date value) {
            addCriterion("ddxcsj <=", value, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjIn(List<Date> values) {
            addCriterion("ddxcsj in", values, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjNotIn(List<Date> values) {
            addCriterion("ddxcsj not in", values, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjBetween(Date value1, Date value2) {
            addCriterion("ddxcsj between", value1, value2, "ddxcsj");
            return (Criteria) this;
        }

        public Criteria andDdxcsjNotBetween(Date value1, Date value2) {
            addCriterion("ddxcsj not between", value1, value2, "ddxcsj");
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

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("djsj is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("djsj is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(Date value) {
            addCriterion("djsj =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(Date value) {
            addCriterion("djsj <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(Date value) {
            addCriterion("djsj >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("djsj >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(Date value) {
            addCriterion("djsj <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(Date value) {
            addCriterion("djsj <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<Date> values) {
            addCriterion("djsj in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<Date> values) {
            addCriterion("djsj not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(Date value1, Date value2) {
            addCriterion("djsj between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(Date value1, Date value2) {
            addCriterion("djsj not between", value1, value2, "djsj");
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