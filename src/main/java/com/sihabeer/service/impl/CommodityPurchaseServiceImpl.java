package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.mapper.CommodityPurchaseMapper;
import com.sihabeer.service.CommodityPurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommodityPurchaseServiceImpl implements CommodityPurchaseService {
    @Resource
    private CommodityPurchaseMapper commodityPurchaseMapper;
    @Override
    public int insertCommodityPurchase(CommodityPurchase commodityPurchase) {
        return commodityPurchaseMapper.insertCommodityPurchase(commodityPurchase);
    }

    @Override
    public List<CommodityPurchase> listCommodityPurchase(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commodityPurchaseMapper.listCommodityPurchase();
    }

    @Override
    public int deleteCommodityPurchase(String id) {
        return commodityPurchaseMapper.deleteCommodityPurchase(id);
    }

    @Override
    public List<CommodityPurchase> findCommodityPurchase(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commodityPurchaseMapper.findCommodityPurchase(goodsName);
    }
}
