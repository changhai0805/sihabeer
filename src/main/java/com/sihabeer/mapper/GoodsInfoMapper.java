package com.sihabeer.mapper;

import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.GoodsInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsInfoMapper {
    @Select("select * from goodsinfo order by id desc")
    List<GoodsInfo> list();
    @Insert("insert into goodsinfo(id,goods_name,goods_type,quality_time,ferment_method,alcohol_degree,malt_concentration) " +
            "values(#{id},#{goodsName},#{goodsType},#{qualityTime},#{fermentMethod},#{alcoholDegree},#{maltConcentration})")
    int insertGoodsInfo(GoodsInfo goodsInfo);
    @Delete("delete from goodsinfo where id=#{id}")
    int deleteGoodsInfo(String id);
    @Select("select * from goodsinfo where goods_name=#{goodsName}")
    List<GoodsInfo> findGoodsInfo(String goodsName);
    @Update("update goodsinfo set goods_name=#{goodsName},goods_type=#{goodsType},quality_time=#{qualityTime},ferment_method=#{fermentMethod},alcohol_degree=#{alcoholDegree},malt_concentration=#{maltConcentration} where id=#{id}")
    int updateGoodsInfo(GoodsInfo goodsInfo);
}
