package com.sihabeer.mapper;

import com.sihabeer.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsInfoMapper {
    @Select("select * from goodsinfo")
    List<GoodsInfo> list();
}
