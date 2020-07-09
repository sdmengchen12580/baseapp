package com.example.mylibrary.httpUtils.http.app.bean;

import java.util.List;

public class GetReportTypeLst {


    /**
     * code : 200
     * msg : 查询成功
     * data : []
     */

    private String code;
    private String msg;
    private List<DataBean> data;
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String  type_name;
        private boolean isSel;

        public boolean isSel() {
            return isSel;
        }

        public void setSel(boolean sel) {
            isSel = sel;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }
    }
}
