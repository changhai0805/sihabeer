package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.User;
import com.sihabeer.service.CommodityPurchaseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("commoditypurchase")
public class CommodityPurchaseController {
    @Resource
    private CommodityPurchaseService commodityPurchaseService;

    @RequestMapping("list")
    public PageInfo<CommodityPurchase> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<CommodityPurchase> list = commodityPurchaseService.listCommodityPurchase(pageNum,pageSize);
        PageInfo<CommodityPurchase> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insert")
    public int insert(CommodityPurchase commodityPurchase){
        return commodityPurchaseService.insertCommodityPurchase(commodityPurchase);
    }
    @RequestMapping("delete")
    public int delete(String id){
        return commodityPurchaseService.deleteCommodityPurchase(id);
    }
    @RequestMapping("find")
    public PageInfo<CommodityPurchase> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        if(goodsName == null || goodsName.trim().equals("")){
            List<CommodityPurchase> list = commodityPurchaseService.listCommodityPurchase(pageNum,pageSize);
            PageInfo<CommodityPurchase> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<CommodityPurchase> list = commodityPurchaseService.findCommodityPurchase(goodsName,pageNum,pageSize);
        PageInfo<CommodityPurchase> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("update")
    public int updateCommodityPurchase(CommodityPurchase commodityPurchase){
        return commodityPurchaseService.updateCommodityPurchase(commodityPurchase);
    }
    @RequestMapping("updateStatus")
    public int updateStatus(String id,String status){
        return commodityPurchaseService.updateStatus(id,status);
    }
}
