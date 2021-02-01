package com.sihabeer.entity;

import java.math.BigDecimal;

public class GoodsInfo {
    private Integer id;
    private String goodsName;
    private String goodsType;
    private String creatTime;
    private Integer orderNum;
    private String orderPlace;
    private BigDecimal orderPrice;
    private String status;
    private String principal;

    public GoodsInfo() {
    }

    public GoodsInfo(Integer id, String goodsName, String goodsType, String creatTime, Integer orderNum, String orderPlace, BigDecimal orderPrice, String status, String principal) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.creatTime = creatTime;
        this.orderNum = orderNum;
        this.orderPlace = orderPlace;
        this.orderPrice = orderPrice;
        this.status = status;
        this.principal = principal;
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

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
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

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", orderNum=" + orderNum +
                ", orderPlace='" + orderPlace + '\'' +
                ", orderPrice=" + orderPrice +
                ", status='" + status + '\'' +
                ", principal='" + principal + '\'' +
                '}';
    }
}
