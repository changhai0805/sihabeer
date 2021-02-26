package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.CommoditySale;
import com.sihabeer.entity.GoodsInfo;
import com.sihabeer.entity.ProduceTask;
import com.sihabeer.service.GoodsInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("goodsinfo")
public class GoodsInfoController {
    @Resource
    private GoodsInfoService goodsInfoService;
    @RequestMapping("list")
    public PageInfo<GoodsInfo> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<GoodsInfo> list = goodsInfoService.list(pageNum,pageSize);
        PageInfo<GoodsInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insert")
    public int insert(GoodsInfo goodsInfo){
        return goodsInfoService.insertGoodsInfo(goodsInfo);
    }
    @RequestMapping("delete")
    public int delete(String id){
        return goodsInfoService.deleteGoodsInfo(id);
    }
    @RequestMapping("update")
    public int updateGoodsInfo(GoodsInfo goodsInfo){
        return goodsInfoService.updateGoodsInfo(goodsInfo);
    }

    @RequestMapping("find")
    public PageInfo<GoodsInfo> findByGoodsName(String goodsName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {

        if( goodsName== null || goodsName.trim().equals("")){
            List<GoodsInfo> list = goodsInfoService.list(pageNum,pageSize);
            PageInfo<GoodsInfo> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<GoodsInfo> list = goodsInfoService.findGoodsInfo(goodsName,pageNum,pageSize);
        PageInfo<GoodsInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
