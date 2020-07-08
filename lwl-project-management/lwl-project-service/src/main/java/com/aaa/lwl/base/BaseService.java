package com.aaa.lwl.base;

import tk.mybatis.mapper.common.Mapper;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @author wyh
 * date 2020-07-08
 *          通用service
 */
public abstract class BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    protected Mapper getMapper(){
        return mapper;
    }
    public ResultData insertData(T t){
        int insert = mapper.insert(t);
        if(insert > 0){
            return new ResultData().setCode("300").setMsg("数据插入成功");
        }
        return null;
    }

}
