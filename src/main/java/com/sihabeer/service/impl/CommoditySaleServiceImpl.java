package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.mapper.CommoditySaleMapper;
import com.sihabeer.service.CommoditySaleService;
import com.sihabeer.util.Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class CommoditySaleServiceImpl implements CommoditySaleService {
    @Resource
    private CommoditySaleMapper commoditySaleMapper;
    @Override
    public int insertCommoditySale(CommoditySale commoditySale) {
        commoditySale.setId(UUID.randomUUID().toString());
        commoditySale.setCreatTime(Utils.getDateTime());
        return commoditySaleMapper.insertCommoditySale(commoditySale);
    }

    @Override
    public List<CommoditySale> listCommoditySale(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.listCommoditySale();
    }

    @Override
    public int deleteCommoditySale(String id) {
        return commoditySaleMapper.deleteCommoditySale(id);
    }

    @Override
    public List<CommoditySale> findCommoditySale(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.findCommoditySale(goodsName);
    }

    @Override
    public int updateCommoditySale(CommoditySale commoditySale) {
        return commoditySaleMapper.updateCommoditySale(commoditySale);
    }
}
