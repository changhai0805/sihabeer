package com.sihabeer.service;

import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.PurchaseReturn;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PurchaseReturnService {

    int insertPurchaseReturn(PurchaseReturn purchaseReturn);

    List<PurchaseReturn> listPurchaseReturn(int pageNum, int pageSize);

    int deletePurchaseReturn(String id);

    List<PurchaseReturn> findPurchaseReturn(String goodsName,int pageNum, int pageSize);
}
