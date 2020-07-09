package com.example.mylibrary.httpUtils.http.live.bean;

public class GiveIntegralGift {

    /**
     * code : 200
     * msg : 赠送成功
     * data : {"user_level":1,"user_level_icon_url":"","user_level_color":"","user_level_name":"等级一","integral_count":9,"deduct_integral_count":9}
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
         * user_level : 1
         * user_level_icon_url :
         * user_level_color :
         * user_level_name : 等级一
         * integral_count : 9
         * deduct_integral_count : 9
         */

        private int user_level;
        private String user_level_icon_url;
        private String user_level_color;
        private String user_level_name;
        private int integral_count;
        private int deduct_integral_count;

        public int getUser_level() {
            return user_level;
        }

        public void setUser_level(int user_level) {
            this.user_level = user_level;
        }

        public String getUser_level_icon_url() {
            return user_level_icon_url;
        }

        public void setUser_level_icon_url(String user_level_icon_url) {
            this.user_level_icon_url = user_level_icon_url;
        }

        public String getUser_level_color() {
            return user_level_color;
        }

        public void setUser_level_color(String user_level_color) {
            this.user_level_color = user_level_color;
        }

        public String getUser_level_name() {
            return user_level_name;
        }

        public void setUser_level_name(String user_level_name) {
            this.user_level_name = user_level_name;
        }

        public int getIntegral_count() {
            return integral_count;
        }

        public void setIntegral_count(int integral_count) {
            this.integral_count = integral_count;
        }

        public int getDeduct_integral_count() {
            return deduct_integral_count;
        }

        public void setDeduct_integral_count(int deduct_integral_count) {
            this.deduct_integral_count = deduct_integral_count;
        }
    }
}
