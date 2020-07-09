package com.example.mylibrary.httpUtils.http.app.bean;

import java.util.List;

public class GetAgreementList {
    private String error_code;
    /**
     * code : 200
     * msg : 查询成功
     * data : [{"t_id":1,"type_name":"注册协议","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/1"},{"t_id":2,"type_name":"用户服务协议","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/2"},{"t_id":3,"type_name":"充值协议","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/3"},{"t_id":4,"type_name":"积分规则","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/4"},{"t_id":5,"type_name":"签约公会协议","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/5"},{"t_id":6,"type_name":"主播直播协议","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/6"},{"t_id":7,"type_name":"主播直播管理规范","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/7"},{"t_id":8,"type_name":"用户违规管理规范","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/8"},{"t_id":9,"type_name":"关于我们","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/9"},{"t_id":10,"type_name":"联系我们","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/10"},{"t_id":11,"type_name":"鱼络圈隐私政策","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/11"},{"t_id":12,"type_name":"社区公约","http_url":"https://api.ylqzb.com/web.php/Agreement/about_us_info/id/12"}]
     */

    private String code;
    private String msg;
    private List<DataBean> data;

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
         * t_id : 1
         * type_name : 注册协议
         * http_url : https://api.ylqzb.com/web.php/Agreement/about_us_info/id/1
         */

        private int t_id;
        private String type_name;
        private String http_url;

        public int getT_id() {
            return t_id;
        }

        public void setT_id(int t_id) {
            this.t_id = t_id;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public String getHttp_url() {
            return http_url;
        }

        public void setHttp_url(String http_url) {
            this.http_url = http_url;
        }
    }
}
