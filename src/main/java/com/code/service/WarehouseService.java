package com.code.service;

import com.code.entity.Warehouse;
import java.util.List;

/**
 * (Warehouse)表服务接口
 *
 * @author yap
 * @since 2020-05-01 20:50:03
 */
public interface WarehouseService {

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    Warehouse queryById(Integer wid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Warehouse>selectAll();

    /**
     * 新增数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    Warehouse insert(Warehouse warehouse);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouse 实例对象
     * @return 对象列表
     */
    List<Warehouse> queryAll(Warehouse warehouse);

    /**
     * 修改数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    Warehouse update(Warehouse warehouse);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer wid);

}