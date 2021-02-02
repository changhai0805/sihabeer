package com.sihabeer.mapper;

import com.sihabeer.entity.GoodsInfo;
import com.sihabeer.entity.ProduceTask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProduceTaskMapper {
    @Insert("insert into producetask(id,goods_name,goods_type,produce_num,produce_daily,start_time,end_time,status,principal) " +
            "values(#{id},#{goodsName},#{goodsType},#{produceNum},#{produceDaily},#{startTime},#{endTime},#{status},#{principal})")
    int insertProduceTask(ProduceTask produceTask);
    @Select("select * from producetask")
    List<ProduceTask> listProduceTask();
    @Delete("delete from producetask where id=#{id}")
    int deleteProducetask(String id);
    @Select("select * from producetask where goods_name=#{goodsName}")
    List<ProduceTask> findProduceTask(String goodsName);
}
