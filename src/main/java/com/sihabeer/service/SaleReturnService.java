package com.sihabeer.service;

import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.SaleReturn;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SaleReturnService {

    int insertSaleReturn(SaleReturn saleReturn);

    List<SaleReturn> listSaleReturn(int pageNum, int pageSize);

    int deleteSaleReturn(String id);

    List<SaleReturn> findSaleReturn(String goodsName,int pageNum, int pageSize);

    int updateStatus(String id, String status);

    int updateSaleReturn(SaleReturn saleReturn);
}
