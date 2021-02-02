package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.mapper.CommoditySaleMapper;
import com.sihabeer.service.CommoditySaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommoditySaleServiceImpl implements CommoditySaleService {
    @Resource
    private CommoditySaleMapper commoditySaleMapper;
    @Override
    public int insertCommoditySale(CommoditySale commoditySale) {
        return 0;
    }

    @Override
    public List<CommoditySale> listCommoditySale(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.listCommoditySale();
    }

    @Override
    public int deleteCommoditySale(String id) {
        return 0;
    }

    @Override
    public List<CommoditySale> findCommoditySale(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commoditySaleMapper.findCommoditySale(goodsName);
    }
}
