package com.sihabeer.mapper;

import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.PurchaseReturn;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface PurchaseReturnMapper {
    @Insert("insert into purchasereturn(id,goods_name,buy_time,return_reason,return_time,status,principal) " +
            "values(#{id},#{goodsName},#{buyTime},#{returnReason},#{returnTime},#{status},#{principal})")
    int insertPurchaseReturn(PurchaseReturn purchaseReturn);
    @Select("select * from purchasereturn")
    List<PurchaseReturn> listPurchaseReturn();
    @Delete("delete from purchasereturn where id=#{id}")
    int deletePurchaseReturn(String id);
    @Select("select * from purchasereturn where goods_name=#{goodsName}")
    List<PurchaseReturn> findPurchaseReturn(String goodsName);
    @Update("update purchasereturn set goods_name=#{goodsName},buy_time=#{buyTime},return_reason=#{returnReason},return_time=#{returnTime},status=#{status},principal=#{principal} where id=#{id}")
    int updatePurchaseReturn(PurchaseReturn purchaseReturn);
    @Update("update purchasereturn set status=#{status} where id=#{id}")
    int updateStatus(@Param("id")String id,@Param("status")String status);
}
