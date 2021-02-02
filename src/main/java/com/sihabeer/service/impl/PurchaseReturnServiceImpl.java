package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.PurchaseReturn;
import com.sihabeer.mapper.PurchaseReturnMapper;
import com.sihabeer.service.PurchaseReturnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseReturnServiceImpl implements PurchaseReturnService {
    @Resource
    private PurchaseReturnMapper purchaseReturnMapper;
    @Override
    public int insertPurchaseReturn(PurchaseReturn purchaseReturn) {
        return purchaseReturnMapper.insertPurchaseReturn(purchaseReturn);
    }

    @Override
    public List<PurchaseReturn> listPurchaseReturn(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return purchaseReturnMapper.listPurchaseReturn();
    }

    @Override
    public int deletePurchaseReturn(String id) {
        return purchaseReturnMapper.deletePurchaseReturn(id);
    }

    @Override
    public List<PurchaseReturn> findPurchaseReturn(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return purchaseReturnMapper.findPurchaseReturn(goodsName);
    }
}
