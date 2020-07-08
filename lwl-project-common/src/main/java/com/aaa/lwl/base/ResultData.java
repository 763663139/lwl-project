package com.aaa.lwl.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wyh
 * date 2020-07-08
 * 通过接口返回值
 * 将后端的controller的返回值统一
 *
 * T:相当于一个占位符
 */
@Data
@Accessors(chain = true)
public class ResultData<T> implements Serializable {
    private String code;
    private String msg;
    private String detail;
    private T data;
}
