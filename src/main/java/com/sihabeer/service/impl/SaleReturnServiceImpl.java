package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.SaleReturn;
import com.sihabeer.mapper.SaleReturnMapper;
import com.sihabeer.service.SaleReturnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleReturnServiceImpl implements SaleReturnService {
    @Resource
    private SaleReturnMapper saleReturnMapper;
    @Override
    public int insertSaleReturn(SaleReturn saleReturn) {
        return saleReturnMapper.insertSaleReturn(saleReturn);
    }

    @Override
    public List<SaleReturn> listSaleReturn(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return saleReturnMapper.listSaleReturn();
    }

    @Override
    public int deleteSaleReturn(String id) {
        return saleReturnMapper.deleteSaleReturn(id);
    }

    @Override
    public List<SaleReturn> findSaleReturn(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return saleReturnMapper.findSaleReturn(goodsName);
    }

    @Override
    public int updateStatus(String id, String status) {
        return saleReturnMapper.updateStatus(id,status);
    }

    @Override
    public int updateSaleReturn(SaleReturn saleReturn) {
        return saleReturnMapper.updateSaleReturn(saleReturn);
    }
}
