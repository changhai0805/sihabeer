package com.sihabeer.controller;

import com.sihabeer.service.GoodsInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {
    @Resource
    private GoodsInfoService goodsInfoService;
    @RequestMapping("insert")
    public int insertCommodity() {
        goodsInfoService.insertTable();
        return 0;
    }
}
