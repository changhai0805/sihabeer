package com.sihabeer.mapper;

import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.GoodsInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsInfoMapper {
    @Select("select * from goodsinfo")
    List<GoodsInfo> list();
    @Insert("insert into goodsinfo(id,goods_name,goods_type,quality_time,ferment_method,alcohol_degree,malt_concentration) " +
            "values(#{id},#{goodsName},#{goodsType},#{qualityTime},#{fermentMethod},#{alcoholDegree},#{maltConcentration})")
    int insertGoodsInfo(GoodsInfo goodsInfo);
    @Delete("delete from goodsinfo where id=#{id}")
    int deleteGoodsInfo(String id);
    @Select("select * from goodsinfo where goods_name=#{goodsName}")
    List<GoodsInfo> findGoodsInfo(String goodsName);
}
