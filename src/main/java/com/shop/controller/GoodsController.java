package com.shop.controller;

import com.shop.entity.Goods;
import com.shop.entity.GoodsAndColor;
import com.shop.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:12
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Goods selectOne(Integer id) {
        return this.goodsService.queryById(id);
    }
    //查询所有商品
    @GetMapping("selectAll")
    public List<Goods> selectAll(){
        return this.goodsService.AllQuery();
    }
    //查询带图片的所有商品
    @GetMapping("getGoodsColor")
    public List<GoodsAndColor> getGoodsColor(){
        return goodsService.getGoodsColor();
    }

}