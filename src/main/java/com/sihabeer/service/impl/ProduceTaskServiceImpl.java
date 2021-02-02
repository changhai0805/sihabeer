package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.mapper.ProduceTaskMapper;
import com.sihabeer.service.ProduceTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProduceTaskServiceImpl implements ProduceTaskService {
    @Resource
    private ProduceTaskMapper produceTaskMapper;
    @Override
    public int insertProduceTask(ProduceTask produceTask) {
        return 0;
    }

    @Override
    public List<ProduceTask> listProduceTask(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return produceTaskMapper.listProduceTask();
    }

    @Override
    public int deleteProducetask(String id) {
        return 0;
    }

    @Override
    public List<ProduceTask> findProduceTask(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return produceTaskMapper.findProduceTask(goodsName);
    }
}
