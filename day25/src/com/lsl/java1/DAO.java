package com.lsl.java1;

import java.util.List;

/**
 * @author Long
 * @Date 2020/3/22 14:53
 *
 *      DAO:data（base）access object
 *
 */
public class DAO<T> {

    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean delete(T t){
        return false;
    }
    //修改一条记录
    public void  update(int index,T t){

    }
    //查询一条记录
    public T get(T t){
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }
}
