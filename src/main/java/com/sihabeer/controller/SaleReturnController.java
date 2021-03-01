package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.PurchaseReturn;
import com.sihabeer.entity.SaleReturn;
import com.sihabeer.service.SaleReturnService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("salereturn")
public class SaleReturnController {
    @Resource
    private SaleReturnService saleReturnService;
    @RequestMapping("list")
    public PageInfo<SaleReturn> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<SaleReturn> list = saleReturnService.listSaleReturn(pageNum,pageSize);
        PageInfo<SaleReturn> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
//    @RequestMapping("insert")
//    public int insert(SaleReturn saleReturn){
//        return saleReturnService.insertSaleReturn(saleReturn);
//    }
    @RequestMapping("delete")
    public int delete(String id){
        return saleReturnService.deleteSaleReturn(id);
    }
    @RequestMapping("find")
    public PageInfo<SaleReturn> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        if(goodsName == null || goodsName.trim().equals("")){
            List<SaleReturn> list = saleReturnService.listSaleReturn(pageNum,pageSize);
            PageInfo<SaleReturn> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<SaleReturn> list = saleReturnService.findSaleReturn(goodsName,pageNum,pageSize);
        PageInfo<SaleReturn> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("updateStatus")
    public int updateStatus(String id,String status){
        return saleReturnService.updateStatus(id,status);
    }
}
