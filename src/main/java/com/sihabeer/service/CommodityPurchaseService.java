package com.sihabeer.service;

import com.sihabeer.entity.CommodityPurchase;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommodityPurchaseService {

    int insertCommodityPurchase(CommodityPurchase commodityPurchase);

    List<CommodityPurchase> listCommodityPurchase(int pageNum, int pageSize);

    int deleteCommodityPurchase(String id);

    List<CommodityPurchase> findCommodityPurchase(String goodsName,int pageNum, int pageSize);
}
