package com.aaa.lwl.status;

/**
 * @author wyh
 * date 2020-07-08
 * 相当于自定义系统状态
 * enum=枚举
 */
public enum LoginStatus {

    /**
     * 状态定义
     */
    LOGIN_SUCCESS("200", "登录成功"),
    LOGIN_FAILED("400","登陆失败，系统异常"),
    USER_EXIST("201","用户不存在"),
    USER_NOT_EXIST("401","用户不存在"),
    PASSWORD_WRONG("402","密码错误"),
    LOGIN_WRONG("405","用户退出异常");


    LoginStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
