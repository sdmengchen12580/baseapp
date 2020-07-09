package com.example.mylibrary.httpUtils.http.app.bean;

import java.util.List;

public class GetOpenCity {

    /**
     * code : 200
     * msg : 查询成功
     * data : [{"city":110000,"city_name":"北京市"},{"city":110000,"city_name":"北京市"},{"city":110100,"city_name":"北京市"}]
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
        /**
         * city : 110000
         * city_name : 北京市
         */

        private String city_code;
        private String city_name;

        public String getCity() {
            return city_code;
        }

        public void setCity(String city) {
            this.city_code = city;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }
    }
}
