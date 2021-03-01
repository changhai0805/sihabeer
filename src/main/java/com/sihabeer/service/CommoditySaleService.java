package com.sihabeer.service;

import com.sihabeer.entity.CommoditySale;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommoditySaleService {

    int insertCommoditySale(CommoditySale commoditySale);

    List<CommoditySale> listCommoditySale(int pageNum, int pageSize);

    int deleteCommoditySale(String id);

    List<CommoditySale> findCommoditySale(String goodsName,int pageNum, int pageSize);

    int updateCommoditySale(CommoditySale commoditySale);
}
