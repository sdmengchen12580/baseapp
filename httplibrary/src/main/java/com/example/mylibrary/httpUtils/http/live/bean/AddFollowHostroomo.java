package com.example.mylibrary.httpUtils.http.live.bean;

public class AddFollowHostroomo {

    /**
     * code : 200
     * msg : 退出成功
     * data : []
     */

    private String code;
    private String msg;
    private String error_code;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
