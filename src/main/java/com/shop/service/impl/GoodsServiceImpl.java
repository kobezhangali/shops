package com.shop.service.impl;

import com.shop.dao.GoodsDao;
import com.shop.entity.Goods;
import com.shop.entity.GoodsAndColor;
import com.shop.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:12
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */

    public Goods queryById(Integer gid) {
        return this.goodsDao.queryById(gid);
    }

    public List<Goods> AllQuery() {
        return this.goodsDao.AllQuery();
    }

    public List<GoodsAndColor> getGoodsColor() {
        return goodsDao.getGoodsColor();
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    public List<Goods> queryAllByLimit(int offset, int limit) {
        return this.goodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */

    public Goods insert(Goods goods) {
        this.goodsDao.insert(goods);
        return goods;
    }

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */

    public Goods update(Goods goods) {
        this.goodsDao.update(goods);
        return this.queryById(goods.getGid());
    }

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */

    public boolean deleteById(Integer gid) {
        return this.goodsDao.deleteById(gid) > 0;
    }
}