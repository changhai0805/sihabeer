package com.sihabeer.service.impl;

import com.sihabeer.entity.CommodityPurchase;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.GoodsInfo;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.mapper.CommodityPurchaseMapper;
import com.sihabeer.mapper.CommoditySaleMapper;
import com.sihabeer.mapper.GoodsInfoMapper;
import com.sihabeer.mapper.ProduceTaskMapper;
import com.sihabeer.service.GoodsInfoService;
import com.sihabeer.util.Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.util.List;
import java.util.UUID;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Resource
    private GoodsInfoMapper goodsInfoMapper;
    @Resource
    private CommoditySaleMapper commoditySaleMapper;
    @Resource
    private CommodityPurchaseMapper commodityPurchaseMapper;
    @Resource
    private ProduceTaskMapper produceTaskMapper;
    @Override
    public int insertTable() {
        List<GoodsInfo> list = goodsInfoMapper.list();
        for(int k=0;k<2;k++){
            for(int i=0;i<list.size();i++) {
                ProduceTask produceTask = new ProduceTask();
                produceTask.setGoodsName(list.get(i).getGoodsName());
                produceTask.setGoodsType(list.get(i).getGoodsType());
                produceTask.setId(UUID.randomUUID().toString());
                produceTask.setStartTime(Utils.getDateTime());
                produceTask.setEndTime(Utils.getDateTime());
                produceTask.setProduceNum(i*30+6*2+i);
                produceTask.setPrincipal("王五");
                produceTask.setStatus("生产中");
                produceTask.setProduceDaily(i*20+3);
                produceTaskMapper.insertProduceTask(produceTask);
            }
        }

        return 0;
    }
}
