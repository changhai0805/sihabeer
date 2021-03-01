package com.sihabeer.mapper;

import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.SaleReturn;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SaleReturnMapper {
    @Insert("insert into salereturn(id,goods_name,goods_type,return_time,return_reason,return_price,status,principal) " +
            "values(#{id},#{goodsName},#{goodsType},#{returnTime},#{returnReason},#{returnPrice},#{status},#{principal})")
    int insertSaleReturn(SaleReturn saleReturn);
    @Select("select * from salereturn")
    List<SaleReturn> listSaleReturn();
    @Delete("delete from salereturn where id=#{id}")
    int deleteSaleReturn(String id);
    @Select("select * from salereturn where goods_name=#{goodsName}")
    List<SaleReturn> findSaleReturn(String goodsName);
    @Update("update salereturn set status=#{status} where id=#{id}")
    int updateStatus(@Param("id")String id,@Param("status")String status);
}
