package com.sihabeer.mapper;

import com.sihabeer.entity.CommodityPurchase;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityPurchaseMapper {
    @Insert("insert into commoditypurchase(id,goods_name,goods_type,goods_place,buy_num,buy_price,buy_time,status,principal) " +
            "values(#{id},#{goodsName},#{goodsType},#{goodsPlace},#{buyNum},#{buyPrice},#{buyTime},#{status},#{principal})")
    int insertCommodityPurchase(CommodityPurchase commodityPurchase);
    @Select("select * from commoditypurchase")
    List<CommodityPurchase> listCommodityPurchase();
    @Delete("delete from commoditypurchase where id=#{id}")
    int deleteCommodityPurchase(String id);
    @Select("select * from commoditypurchase where goods_name=#{goodsName}")
    List<CommodityPurchase> findCommodityPurchase(String goodsName);
}
