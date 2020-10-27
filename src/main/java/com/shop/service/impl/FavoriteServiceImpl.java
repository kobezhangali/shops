package com.shop.service.impl;

import com.shop.dao.FavoriteDao;
import com.shop.entity.Favorite;
import com.shop.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Favorite)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:07
 */
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteDao favoriteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */

    public Favorite queryById(Integer fid) {
        return this.favoriteDao.queryById(fid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    public List<Favorite> queryAllByLimit(int offset, int limit) {
        return this.favoriteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param favorite 实例对象
     * @return 实例对象
     */

    public Favorite insert(Favorite favorite) {
        this.favoriteDao.insert(favorite);
        return favorite;
    }

    /**
     * 修改数据
     *
     * @param favorite 实例对象
     * @return 实例对象
     */

    public Favorite update(Favorite favorite) {
        this.favoriteDao.update(favorite);
        return this.queryById(favorite.getFid());
    }

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 是否成功
     */

    public boolean deleteById(Integer fid) {
        return this.favoriteDao.deleteById(fid) > 0;
    }
}