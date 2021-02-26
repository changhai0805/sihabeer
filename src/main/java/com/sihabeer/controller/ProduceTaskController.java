package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.GoodsInfo;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.entity.User;
import com.sihabeer.service.ProduceTaskService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("producetask")
public class ProduceTaskController {
    @Resource
    private ProduceTaskService produceTaskService;
    @RequestMapping("list")
    public PageInfo<ProduceTask> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<ProduceTask> list = produceTaskService.listProduceTask(pageNum,pageSize);
        PageInfo<ProduceTask> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insert")
    public int insert(ProduceTask produceTask){
        return produceTaskService.insertProduceTask(produceTask);
    }
    @RequestMapping("delete")
    public int delete(String id){
        return produceTaskService.deleteProducetask(id);
    }
    @RequestMapping("update")
    public int updateUserInfo(ProduceTask produceTask){
        return produceTaskService.updateProduceTask(produceTask);
    }

    @RequestMapping("find")
    public PageInfo<ProduceTask> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        if(goodsName.trim().equals("")||goodsName==null){
            List<ProduceTask> list = produceTaskService.listProduceTask(pageNum,pageSize);
            PageInfo<ProduceTask> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<ProduceTask> list = produceTaskService.findProduceTask(goodsName,pageNum,pageSize);
        PageInfo<ProduceTask> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
