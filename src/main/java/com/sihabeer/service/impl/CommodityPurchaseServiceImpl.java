package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.entity.PurchaseReturn;
import com.sihabeer.mapper.CommodityPurchaseMapper;
import com.sihabeer.mapper.PurchaseReturnMapper;
import com.sihabeer.service.CommodityPurchaseService;
import com.sihabeer.util.Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class CommodityPurchaseServiceImpl implements CommodityPurchaseService {
    @Resource
    private CommodityPurchaseMapper commodityPurchaseMapper;
    @Resource
    private PurchaseReturnMapper purchaseReturnMapper;
    @Override
    public int insertCommodityPurchase(CommodityPurchase commodityPurchase) {
        commodityPurchase.setId(UUID.randomUUID().toString());
        return commodityPurchaseMapper.insertCommodityPurchase(commodityPurchase);
    }

    @Override
    public List<CommodityPurchase> listCommodityPurchase(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commodityPurchaseMapper.listCommodityPurchase();
    }

    @Override
    public int deleteCommodityPurchase(String id) {
        List<CommodityPurchase> list = commodityPurchaseMapper.selectById(id);
        CommodityPurchase commodityPurchase = list.get(0);
        PurchaseReturn purchaseReturn = new PurchaseReturn();
        purchaseReturn.setId(id);
        try {
            purchaseReturn.setPrincipal(commodityPurchase.getPrincipal());
        }catch (Exception e){
            e.getMessage();
        }
        try {
            purchaseReturn.setBuyTime(commodityPurchase.getBuyTime());
        }catch (Exception e){
            e.getMessage();
        }
        try {
            purchaseReturn.setGoodsName(commodityPurchase.getGoodsName());
        }catch (Exception e){
            e.getMessage();
        }
        purchaseReturn.setReturnTime(Utils.getDateTime());
        purchaseReturn.setReturnReason("生产原料过剩");
        purchaseReturn.setStatus("待退货");
        purchaseReturnMapper.insertPurchaseReturn(purchaseReturn);
        return commodityPurchaseMapper.deleteCommodityPurchase(id);
    }

    @Override
    public List<CommodityPurchase> findCommodityPurchase(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commodityPurchaseMapper.findCommodityPurchase(goodsName);
    }

    @Override
    public int updateCommodityPurchase(CommodityPurchase commodityPurchase) {
        return commodityPurchaseMapper.updateCommodityPurchase(commodityPurchase);
    }

    @Override
    public int updateStatus(String id, String status) {
        return commodityPurchaseMapper.updateStatus(id,status);
    }
}
