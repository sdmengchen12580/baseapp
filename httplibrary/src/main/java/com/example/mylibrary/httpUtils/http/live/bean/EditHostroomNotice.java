package com.example.mylibrary.httpUtils.http.live.bean;

import java.util.List;

public class EditHostroomNotice {
    private String error_code;
    /**
     * code : 200
     * msg : 提交成功
     * data : []
     */

    private String code;
    private String msg;

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
