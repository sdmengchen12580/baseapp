package com.example.mylibrary.httpUtils.http.user.bean;

public class EditUserinfo {
    /**
     * code : 200
     * msg : 保存成功
     * data : {"head_url":"http://local.images.ylqzb.com/head/201912/09/5dee0694848f1.png","homepage_background_pic":""}
     */

    private String code;
    private String msg;
    private DataBean data;
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }


    public static class DataBean {
        /**
         * head_url : http://local.images.ylqzb.com/head/201912/09/5dee0694848f1.png
         * homepage_background_pic :
         */

        private String head_url;
        private String homepage_background_pic;

        public String getHead_url() {
            return head_url;
        }

        public void setHead_url(String head_url) {
            this.head_url = head_url;
        }

        public String getHomepage_background_pic() {
            return homepage_background_pic;
        }

        public void setHomepage_background_pic(String homepage_background_pic) {
            this.homepage_background_pic = homepage_background_pic;
        }
    }
}
