package com.sihabeer.entity;

public class PurchaseReturn {
    private String id;
    private String goodsName;
    private String buyTime;
    private String returnReason;
    private String returnTime;
    private String status;
    private String principal;

    public PurchaseReturn() {
    }

    public PurchaseReturn(String id, String goodsName, String buyTime, String returnReason, String returnTime, String status, String principal) {
        this.id = id;
        this.goodsName = goodsName;
        this.buyTime = buyTime;
        this.returnReason = returnReason;
        this.returnTime = returnTime;
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

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
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
