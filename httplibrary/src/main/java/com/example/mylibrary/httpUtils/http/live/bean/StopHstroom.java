package com.example.mylibrary.httpUtils.http.live.bean;

public class StopHstroom {


    /**
     * code : 200
     * msg : 结束成功
     * data : {"yu_num":0,"look_count":0,"earn":0,"integral_count":0,"start_live_count":102,"follow_count":0,"all_time":"00:00:09","user_level":1,"user_level_name":"等级一","user_level_icon_url":"","user_level_color":"","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}
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
         * yu_num : 0
         * look_count : 0
         * earn : 0
         * integral_count : 0
         * start_live_count : 102
         * follow_count : 0
         * all_time : 00:00:09
         * user_level : 1
         * user_level_name : 等级一
         * user_level_icon_url :
         * user_level_color :
         * host_level : 1
         * host_level_name : 等级一
         * host_level_icon_url :
         */

        private int yu_num;
        private int look_count;
        private int earn;
        private int integral_count;
        private int start_live_count;
        private int follow_count;
        private String all_time;
        private int user_level;
        private String user_level_name;
        private String user_level_icon_url;
        private String user_level_color;
        private int host_level;
        private String host_level_name;
        private String host_level_icon_url;

        public int getYu_num() {
            return yu_num;
        }

        public void setYu_num(int yu_num) {
            this.yu_num = yu_num;
        }

        public int getLook_count() {
            return look_count;
        }

        public void setLook_count(int look_count) {
            this.look_count = look_count;
        }

        public int getEarn() {
            return earn;
        }

        public void setEarn(int earn) {
            this.earn = earn;
        }

        public int getIntegral_count() {
            return integral_count;
        }

        public void setIntegral_count(int integral_count) {
            this.integral_count = integral_count;
        }

        public int getStart_live_count() {
            return start_live_count;
        }

        public void setStart_live_count(int start_live_count) {
            this.start_live_count = start_live_count;
        }

        public int getFollow_count() {
            return follow_count;
        }

        public void setFollow_count(int follow_count) {
            this.follow_count = follow_count;
        }

        public String getAll_time() {
            return all_time;
        }

        public void setAll_time(String all_time) {
            this.all_time = all_time;
        }

        public int getUser_level() {
            return user_level;
        }

        public void setUser_level(int user_level) {
            this.user_level = user_level;
        }

        public String getUser_level_name() {
            return user_level_name;
        }

        public void setUser_level_name(String user_level_name) {
            this.user_level_name = user_level_name;
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

        public int getHost_level() {
            return host_level;
        }

        public void setHost_level(int host_level) {
            this.host_level = host_level;
        }

        public String getHost_level_name() {
            return host_level_name;
        }

        public void setHost_level_name(String host_level_name) {
            this.host_level_name = host_level_name;
        }

        public String getHost_level_icon_url() {
            return host_level_icon_url;
        }

        public void setHost_level_icon_url(String host_level_icon_url) {
            this.host_level_icon_url = host_level_icon_url;
        }
    }
}
