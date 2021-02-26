package com.sihabeer.entity;

import java.math.BigDecimal;

public class GoodsInfo {
    private Integer id;
    private String goodsName;
    private String goodsType;
    private String qualityTime;
    private String fermentMethod;
    private String alcoholDegree;
    private String maltConcentration;

    public GoodsInfo() {
    }

    public GoodsInfo(Integer id, String goodsName, String goodsType, String qualityTime, String fermentMethod, String alcoholDegree, String maltConcentration) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.qualityTime = qualityTime;
        this.fermentMethod = fermentMethod;
        this.alcoholDegree = alcoholDegree;
        this.maltConcentration = maltConcentration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(String qualityTime) {
        this.qualityTime = qualityTime;
    }

    public String getFermentMethod() {
        return fermentMethod;
    }

    public void setFermentMethod(String fermentMethod) {
        this.fermentMethod = fermentMethod;
    }

    public String getAlcoholDegree() {
        return alcoholDegree;
    }

    public void setAlcoholDegree(String alcoholDegree) {
        this.alcoholDegree = alcoholDegree;
    }

    public String getMaltConcentration() {
        return maltConcentration;
    }

    public void setMaltConcentration(String maltConcentration) {
        this.maltConcentration = maltConcentration;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", qualityTime='" + qualityTime + '\'' +
                ", fermentMethod='" + fermentMethod + '\'' +
                ", alcoholDegree='" + alcoholDegree + '\'' +
                ", maltConcentration='" + maltConcentration + '\'' +
                '}';
    }
}