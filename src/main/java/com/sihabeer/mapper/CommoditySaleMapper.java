package com.sihabeer.mapper;

import com.sihabeer.entity.CommoditySale;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommoditySaleMapper {
    @Insert("insert into commoditysale(id,goods_name,goods_type,creat_time,order_num,order_place,order_price,status,principal)" +
            "values(#{id},#{goodsName},#{goodsType},#{creatTime},#{orderNum},#{orderPlace},#{orderPrice},#{status},#{principal}) ")
    int insertCommoditySale(CommoditySale commoditySale);
}
