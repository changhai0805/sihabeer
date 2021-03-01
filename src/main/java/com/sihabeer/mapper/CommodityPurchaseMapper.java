package com.sihabeer.mapper;

import com.sihabeer.entity.CommodityPurchase;
import org.apache.ibatis.annotations.*;

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
    @Update("update commoditypurchase set goods_name=#{goodsName},goods_type=#{goodsType},goods_place=#{goodsPlace},buy_num=#{buyNum},buy_price=#{buyPrice},buy_time=#{buyTime},status=#{status},principal=#{principal} where id=#{id}")
    int updateCommodityPurchase(CommodityPurchase commodityPurchase);
    @Update("update commoditypurchase set status=#{status} where id=#{id}")
    int updateStatus(@Param("id")String id,@Param("status")String status);
    @Select("select * from commoditypurchase where id=#{id}")
    List<CommodityPurchase> selectById(String id);
}
