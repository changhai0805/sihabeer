package com.sihabeer.entity;

public class ProduceTask {
    private String id;
    private String goodsName;
    private String goodsType;
    private Integer produceNum;
    private Integer produceDaily;
    private String startTime;
    private String endTime;
    private String status;
    private String principal;

    public ProduceTask() {
    }

    public ProduceTask(String id, String goodsName, String goodsType, Integer produceNum, Integer produceDaily, String startTime, String endTime, String status, String principal) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.produceNum = produceNum;
        this.produceDaily = produceDaily;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public Integer getProduceNum() {
        return produceNum;
    }

    public void setProduceNum(Integer produceNum) {
        this.produceNum = produceNum;
    }

    public Integer getProduceDaily() {
        return produceDaily;
    }

    public void setProduceDaily(Integer produceDaily) {
        this.produceDaily = produceDaily;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
