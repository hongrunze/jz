package com.jz.model;

import java.io.Serializable;
import java.util.Date;

public class RelationJzaj implements Serializable {
    private String ajbh;

    private String gljqbh;

    private String ajmc;

    private String ajlb;

    private String sldw;

    private String afsj;

    private String bary;

    private String sary;

    private String cjlb;

    private String cjrbh;

    private String cjrxm;

    private String cjdwbm;

    private String cjdwmc;

    private String cjsj;

    private String afdi;

    private String cljqnr;

    private String glsp;

    private Date inserttime;

    private Date djsj;

    private Integer glgs;

    public RelationJzaj(String ajbh, String gljqbh, String ajmc, String ajlb, String sldw, String afsj, String bary, String sary, String cjlb, String cjrbh, String cjrxm, String cjdwbm, String cjdwmc, String cjsj, String afdi, String cljqnr, String glsp, Date inserttime, Integer glgs) {
        this.ajbh = ajbh;
        this.gljqbh = gljqbh;
        this.ajmc = ajmc;
        this.ajlb = ajlb;
        this.sldw = sldw;
        this.afsj = afsj;
        this.bary = bary;
        this.sary = sary;
        this.cjlb = cjlb;
        this.cjrbh = cjrbh;
        this.cjrxm = cjrxm;
        this.cjdwbm = cjdwbm;
        this.cjdwmc = cjdwmc;
        this.cjsj = cjsj;
        this.afdi = afdi;
        this.cljqnr = cljqnr;
        this.glsp = glsp;
        this.inserttime = inserttime;
        this.glgs = glgs;
    }

    public RelationJzaj() {
        super();
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh == null ? null : ajbh.trim();
    }

    public String getGljqbh() {
        return gljqbh;
    }

    public void setGljqbh(String gljqbh) {
        this.gljqbh = gljqbh == null ? null : gljqbh.trim();
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc == null ? null : ajmc.trim();
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb == null ? null : ajlb.trim();
    }

    public String getSldw() {
        return sldw;
    }

    public void setSldw(String sldw) {
        this.sldw = sldw == null ? null : sldw.trim();
    }

    public String getAfsj() {
        return afsj;
    }

    public void setAfsj(String afsj) {
        this.afsj = afsj == null ? null : afsj.trim();
    }

    public String getBary() {
        return bary;
    }

    public void setBary(String bary) {
        this.bary = bary == null ? null : bary.trim();
    }

    public String getSary() {
        return sary;
    }

    public void setSary(String sary) {
        this.sary = sary == null ? null : sary.trim();
    }

    public String getCjlb() {
        return cjlb;
    }

    public void setCjlb(String cjlb) {
        this.cjlb = cjlb == null ? null : cjlb.trim();
    }

    public String getCjrbh() {
        return cjrbh;
    }

    public void setCjrbh(String cjrbh) {
        this.cjrbh = cjrbh == null ? null : cjrbh.trim();
    }

    public String getCjrxm() {
        return cjrxm;
    }

    public void setCjrxm(String cjrxm) {
        this.cjrxm = cjrxm == null ? null : cjrxm.trim();
    }

    public String getCjdwbm() {
        return cjdwbm;
    }

    public void setCjdwbm(String cjdwbm) {
        this.cjdwbm = cjdwbm == null ? null : cjdwbm.trim();
    }

    public String getCjdwmc() {
        return cjdwmc;
    }

    public void setCjdwmc(String cjdwmc) {
        this.cjdwmc = cjdwmc == null ? null : cjdwmc.trim();
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj == null ? null : cjsj.trim();
    }

    public String getAfdi() {
        return afdi;
    }

    public void setAfdi(String afdi) {
        this.afdi = afdi == null ? null : afdi.trim();
    }

    public String getCljqnr() {
        return cljqnr;
    }

    public void setCljqnr(String cljqnr) {
        this.cljqnr = cljqnr == null ? null : cljqnr.trim();
    }

    public String getGlsp() {
        return glsp;
    }

    public void setGlsp(String glsp) {
        this.glsp = glsp == null ? null : glsp.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Integer getGlgs() {
        return glgs;
    }

    public void setGlgs(Integer glgs) {
        this.glgs = glgs;
    }

    public Date getDjsj() {
        return djsj;
    }

    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }
}