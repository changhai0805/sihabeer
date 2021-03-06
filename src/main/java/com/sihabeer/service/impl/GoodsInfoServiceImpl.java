package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.GoodsInfo;
import com.sihabeer.mapper.GoodsInfoMapper;
import com.sihabeer.service.GoodsInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    private GoodsInfoMapper goodsInfoMapper;
    @Override
    public List<GoodsInfo> list(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return goodsInfoMapper.list();
    }

    @Override
    public int insertGoodsInfo(GoodsInfo goodsInfo) {
        return goodsInfoMapper.insertGoodsInfo(goodsInfo);
    }

    @Override
    public int deleteGoodsInfo(String id) {
        return goodsInfoMapper.deleteGoodsInfo(id);
    }

    @Override
    public List<GoodsInfo> findGoodsInfo(String goodsName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return goodsInfoMapper.findGoodsInfo(goodsName);
    }

    @Override
    public int updateGoodsInfo(GoodsInfo goodsInfo) {
        return goodsInfoMapper.updateGoodsInfo(goodsInfo);
    }
}
