package com.sihabeer.mapper;

import com.sihabeer.entity.ProduceTask;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProduceTaskMapper {
    @Insert("insert into producetask(id,goods_name,goods_type,produce_num,produce_daily,start_time,end_time,status,principal) " +
            "values(#{id},#{goodsName},#{goodsType},#{produceNum},#{produceDaily},#{startTime},#{endTime},#{status},#{principal})")
    int insertProduceTask(ProduceTask produceTask);
}
