package com.sihabeer.entity;

import java.math.BigDecimal;

public class CommodityPurchase {
    private String id;
    private String goodsName;
    private String goodsType;
    private String goodsPlace;
    private Integer buyNum;
    private BigDecimal buyPrice;
    private String buyTime;
    private String status;
    private String principal;

    public CommodityPurchase() {
    }

    public CommodityPurchase(String id, String goodsName, String goodsType, String goodsPlace, Integer buyNum, BigDecimal buyPrice, String buyTime, String status, String principal) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.goodsPlace = goodsPlace;
        this.buyNum = buyNum;
        this.buyPrice = buyPrice;
        this.buyTime = buyTime;
        this.status = status;
        this.principal = principal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }
}
