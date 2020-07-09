package com.example.mylibrary.httpUtils.http.user.bean;

public class SetBlacklist {

    /**
     * code : 200
     * msg :
     * data : 撤销成功
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
