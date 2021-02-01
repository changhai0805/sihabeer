package com.sihabeer.mapper;

import com.sihabeer.entity.CommodityPurchase;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityPurchaseMapper {
    @Insert("insert into commoditypurchase(id,goods_name,goods_type,goods_place,buy_num,buy_price,buy_time,status,principal) " +
            "values(#{id},#{goodsName},#{goodsType},#{goodsPlace},#{buyNum},#{buyPrice},#{buyTime},#{status},#{principal})")
    int insertCommodityPurchase(CommodityPurchase commodityPurchase);
}
