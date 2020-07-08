package com.aaa.lwl.base;

import java.util.Map;

/**
 * @author wyh
 * date 2020-07-08
 */
public abstract class CommonController<T> extends BaseController {
    public abstract  BaseService<T> getBaseService();
    public ResultData add(Map map){
        return new ResultData();
    }
}
