package com.shop.controller;

import com.shop.entity.Favorite;
import com.shop.service.FavoriteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Favorite)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:08
 */
@RestController
@RequestMapping("favorite")
public class FavoriteController {
    /**
     * 服务对象
     */
    @Resource
    private FavoriteService favoriteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Favorite selectOne(Integer id) {
        return this.favoriteService.queryById(id);
    }
    //用户添加收藏
    @PostMapping("/insertFavorite")
    public Favorite insert(Favorite favorite){
        return this.favoriteService.insert(favorite);
    }
    //删除收藏
    @GetMapping("/deleteFavoriteById/{fid}")
    public boolean deleteFavoriteById(@PathVariable("fid") int fid){
        return this.favoriteService.deleteById(fid);
    }

}
