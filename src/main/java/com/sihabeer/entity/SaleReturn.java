package com.sihabeer.entity;

import java.math.BigDecimal;

public class SaleReturn {
    private String id;
    private String goodsName;
    private String goodsType;
    private String returnTime;
    private String returnReason;
    private BigDecimal returnPrice;
    private String status;
    private String principal;

    public SaleReturn() {
    }

    public SaleReturn(String id, String goodsName, String goodsType, String returnTime, String returnReason, BigDecimal returnPrice, String status, String principal) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.returnTime = returnTime;
        this.returnReason = returnReason;
        this.returnPrice = returnPrice;
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

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public BigDecimal getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice(BigDecimal returnPrice) {
        this.returnPrice = returnPrice;
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
