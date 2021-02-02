package com.sihabeer.service;

import com.sihabeer.entity.ProduceTask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProduceTaskService {
    int insertProduceTask(ProduceTask produceTask);

    List<ProduceTask> listProduceTask(int pageNum, int pageSize);

    int deleteProducetask(String id);

    List<ProduceTask> findProduceTask(String goodsName,int pageNum, int pageSize);
}
