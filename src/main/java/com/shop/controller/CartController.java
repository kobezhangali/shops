package com.shop.controller;

import com.shop.entity.Cart;
import com.shop.service.CartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cart)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:49
 */
@RestController
@RequestMapping("cart")
public class CartController {
    /**
     * 服务对象
     */
    @Resource
    private CartService cartService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cart selectOne(Integer id) {
        return this.cartService.queryById(id);
    }

}