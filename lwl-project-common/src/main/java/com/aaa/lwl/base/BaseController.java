package com.aaa.lwl.base;

import static com.aaa.lwl.status.LoginStatus.*;

/**
 * @author wyh
 * date 2020-07-08
 * 统一controller
 * 所有的controller都要继承这个controller，进行统一返回
 *
 *             code:200 msg:登录成功
 *  *          code:400 msg:登录失败，系统异常
 *  *          code:201 msg:用户已经存在
 *  *          code:401 msg:用户不存在
 *  *          code:402 msg:密码错误
 *  *          code:405 msg:用户退出异常
 */
public class BaseController {
    /**
     * 登陆成功，使用系统消息
     * @return
     */
    protected ResultData loginSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }
    /**
     * 登陆成功，使用自定义消息
     */
    protected ResultData loginSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }
    /**
     * 登录成功
     * 返回数据信息。使用系统消息
     */
    protected ResultData loginSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return  resultData;
    }
    /**
     * 登录成功
     * 返回数据信息。使用自定义消息
     */
    protected ResultData loginSuccess(String msg,Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }
    /**
     * 登录失败，使用系统消息
     */
    protected ResultData loginFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }
    /**
     * 登陆失败，使用系统消息，详细解释说明
     */
    protected ResultData loginFailed(String detail){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }
}
