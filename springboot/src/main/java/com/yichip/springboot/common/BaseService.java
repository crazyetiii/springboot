package com.yichip.springboot.common;

import java.util.List;

/**
 * @Description TODO
 * @Author ocean
 * @Date 2019/5/23 16:12
 **/
public interface BaseService<T> {

    List<T> list(T entity);

    T get(T entity);

    int update(T entity);

    int save(T entity);

    int delete(T entity);
}
