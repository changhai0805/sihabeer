package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.PurchaseReturn;
import com.sihabeer.entity.SaleReturn;
import com.sihabeer.service.PurchaseReturnService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("purchasereturn")
public class PurchaseReturnController {
    @Resource
    private PurchaseReturnService purchaseReturnService;
    @RequestMapping("list")
    public PageInfo<PurchaseReturn> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<PurchaseReturn> list = purchaseReturnService.listPurchaseReturn(pageNum,pageSize);
        PageInfo<PurchaseReturn> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insert")
    public int insert(PurchaseReturn purchaseReturn){
        return purchaseReturnService.insertPurchaseReturn(purchaseReturn);
    }
    @RequestMapping("delete")
    public int delete(String id){
        return purchaseReturnService.deletePurchaseReturn(id);
    }
    @RequestMapping("find")
    public PageInfo<PurchaseReturn> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        if(goodsName==null || goodsName.trim().equals("")){
            List<PurchaseReturn> list = purchaseReturnService.listPurchaseReturn(pageNum,pageSize);
            PageInfo<PurchaseReturn> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<PurchaseReturn> list = purchaseReturnService.findPurchaseReturn(goodsName,pageNum,pageSize);
        PageInfo<PurchaseReturn> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("update")
    public int updatePurchaseReturn(PurchaseReturn purchaseReturn){
        return purchaseReturnService.updatePurchaseReturn(purchaseReturn);
    }
    @RequestMapping("updateStatus")
    public int updateStatus(String id,String status){
        return purchaseReturnService.updateStatus(id,status);
    }
}
