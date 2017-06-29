package com.mello.spring.dao.common;

import org.hibernate.LockMode;

import java.util.Collection;
import java.util.List;

/**
 * Created by lenovo on 2017/6/29.
 */
public interface Dao<T,PK> {
    /**
     * 按照主键取实体
     *
     * @param id
     * @return 实体
     */
    public abstract T get(PK id);

    /**
     * 根据PK列表返回实体类列表
     *
     * @param ids
     * @return List<实体>
     */
    public abstract List<T> getList(List<PK> ids);

    /**
     * 获得所有的实体类
     *
     * @return List<实体>
     */
    public abstract List<T> getAll();
    /**
     * 按照排序字段获得所有的实体
     * @param desc	升序还是降序true-降序，false-升序
     * @param orderProperName 属性字段名
     * @return
     */
    public abstract List<T> getAll(Boolean desc, String orderProperName);

    /**
     * 分页取实体
     *
     * @param pageIndex	页序号，从1开始
     * @param pageSize 页大小
     * @return List<实体>
     */
    public abstract List<T> page(int pageIndex, int pageSize);

    /**
     * 分页取实体（按照排序字段分页）
     *
     * @param pageIndex	页序号，从1开始
     * @param pageSize 也大小
     * @param desc 排序类型，true降序,false升序
     * @param orderProperName
     *            排序字段名（实体类的属性名）
     * @return
     */
    public abstract List<T> page(int pageIndex, int pageSize, Boolean desc,
                                 String orderProperName);

    /**
     * 保存实体
     * @return 主键
     */
    public abstract PK save(T entity);

    /**
     * 持久化或更新实体
     * @param entity
     */
    public abstract void saveOrUpdate(T entity);

    /**
     * 取得该实体的数量
     *
     * @return
     */
    public abstract int Count();

    /**
     * 删除实体
     *
     * @param entity
     */
    public abstract void delete(T entity);

    /**
     * 删除实体们
     * @param entities
     */
    public abstract void deleteAll(Collection<T> entities);

    /**
     * 根据主键删除实体
     *
     * @param id
     */
    public abstract void deleteByKey(PK id);

    /**
     * 强制SessionFlush（）
     *
     */
    public abstract void flush();

    /**
     * 给实体加锁
     *
     * @param entity
     * @param lock
     */
    public abstract void lock(T entity, LockMode lock);
}
