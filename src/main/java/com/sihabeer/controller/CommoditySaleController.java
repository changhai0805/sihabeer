package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.service.CommoditySaleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("commoditysale")
public class CommoditySaleController {
    @Resource
    private CommoditySaleService commoditySaleService;
    @RequestMapping("list")
    public PageInfo<CommoditySale> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<CommoditySale> list = commoditySaleService.listCommoditySale(pageNum,pageSize);
        PageInfo<CommoditySale> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insert")
    public int insert(CommoditySale commoditySale){
        return commoditySaleService.insertCommoditySale(commoditySale);
    }
    @RequestMapping("delete")
    public int delete(String id){
        return commoditySaleService.deleteCommoditySale(id);
    }
    @RequestMapping("find")
    public PageInfo<CommoditySale> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<CommoditySale> list = commoditySaleService.findCommoditySale(goodsName,pageNum,pageSize);
        PageInfo<CommoditySale> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
