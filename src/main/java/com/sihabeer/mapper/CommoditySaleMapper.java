package com.sihabeer.mapper;

import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.entity.CommoditySale;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommoditySaleMapper {
    @Insert("insert into commoditysale(id,goods_name,goods_type,creat_time,order_num,order_place,order_price,status,principal)" +
            "values(#{id},#{goodsName},#{goodsType},#{creatTime},#{orderNum},#{orderPlace},#{orderPrice},#{status},#{principal}) ")
    int insertCommoditySale(CommoditySale commoditySale);
    @Select("select * from commoditysale order by creat_time desc")
    List<CommoditySale> listCommoditySale();
    @Delete("delete from commoditysale where id=#{id}")
    int deleteCommoditySale(String id);
    @Select("select * from commoditysale where goods_name=#{goodsName}")
    List<CommoditySale> findCommoditySale(String goodsName);
    @Update("update commoditysale set goods_name=#{goodsName},goods_type=#{goodsType},creat_time=#{creatTime},order_num=#{orderNum},order_place=#{orderPlace},order_price=#{orderPrice},status=#{status},principal=#{principal} where id =#{id}")
    int updateCommoditySale(CommoditySale commoditySale);
    @Update("update commoditysale set status=#{status} where id=#{id}")
    int updateStatus(@Param("id")String id,@Param("status")String status);
    @Select("select * from commoditysale where id=#{id}")
    List<CommoditySale> findById(String id);
}
