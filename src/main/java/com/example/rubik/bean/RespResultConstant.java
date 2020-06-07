package com.example.rubik.bean;

public enum RespResultConstant {
    /** 成功以0开头 */
    SUCCESS(0x000000, "请求成功"),
    /** 失败以1开头 */
    FAILED(0x100000, "请求失败"),
    /** 超时以2开头 */
    TIMEOUT(0x200000, "请求超时"),
    /** 状态码最大值 */
    MAX(0xFFFFFF, "系统错误");

    private Integer code;
    private String msg;

    RespResultConstant(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
