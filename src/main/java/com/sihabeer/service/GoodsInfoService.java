package com.sihabeer.service;

import com.sihabeer.entity.GoodsInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsInfoService {

    List<GoodsInfo> list(int pageNum, int pageSize);

    int insertGoodsInfo(GoodsInfo goodsInfo);

    int deleteGoodsInfo(String id);

    List<GoodsInfo> findGoodsInfo(String goodsName,int pageNum, int pageSize);
}
