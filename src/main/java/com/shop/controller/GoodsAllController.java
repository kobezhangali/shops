package com.shop.controller;

import com.shop.entity.GoodsAll;
import com.shop.service.GoodsAllService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("goodsAll")
public class GoodsAllController  {
    @Resource
    private GoodsAllService goodsAllService;
    //根据商品的id查询商品的所有信息
    @GetMapping("/getGoodsAll/{gid}")
    public List<GoodsAll> getGoodsAll(@PathVariable("gid") int gid){


        return goodsAllService.getGoodsAll(gid);
    }
}
