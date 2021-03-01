package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.SaleReturn;
import com.sihabeer.mapper.CommoditySaleMapper;
import com.sihabeer.mapper.SaleReturnMapper;
import com.sihabeer.service.CommoditySaleService;
import com.sihabeer.util.Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class CommoditySaleServiceImpl implements CommoditySaleService {
    @Resource
    private CommoditySaleMapper commoditySaleMapper;
    @Resource
    private SaleReturnMapper saleReturnMapper;
    @Override
    public int insertCommoditySale(CommoditySale commoditySale) {
        commoditySale.setId(UUID.randomUUID().toString());
        commoditySale.setCreatTime(Utils.getDateTime());
        return commoditySaleMapper.insertCommoditySale(commoditySale);
    }

    @Override
    public List<CommoditySale> listCommoditySale(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.listCommoditySale();
    }

    @Override
    public int deleteCommoditySale(String id) {
        List<CommoditySale> list = commoditySaleMapper.findById(id);
        CommoditySale commoditySale = list.get(0);
        SaleReturn saleReturn = new SaleReturn();
        try {
            saleReturn.setGoodsName(commoditySale.getGoodsName());
        }catch (Exception e){
            e.getMessage();
        }
        try {
            saleReturn.setGoodsType(commoditySale.getGoodsType());
        }catch (Exception e){
            e.getMessage();
        }
        try {
            saleReturn.setPrincipal(commoditySale.getPrincipal());
        }catch (Exception e){
            e.getMessage();
        }
        try {
            saleReturn.setReturnPrice(commoditySale.getOrderPrice());
        }catch (Exception e){
            e.getMessage();
        }
        saleReturn.setId(commoditySale.getId());
        saleReturn.setReturnTime(Utils.getDateTime());
        saleReturn.setReturnReason("暂无市场需求");
        saleReturn.setStatus("待退货");
        saleReturnMapper.insertSaleReturn(saleReturn);
        return commoditySaleMapper.deleteCommoditySale(id);
    }

    @Override
    public List<CommoditySale> findCommoditySale(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.findCommoditySale(goodsName);
    }

    @Override
    public int updateCommoditySale(CommoditySale commoditySale) {
        return commoditySaleMapper.updateCommoditySale(commoditySale);
    }

    @Override
    public int updateStatus(String id, String status) {
        return commoditySaleMapper.updateStatus(id,status);
    }
}
