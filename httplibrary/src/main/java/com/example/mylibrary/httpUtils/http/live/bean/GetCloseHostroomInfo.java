package com.example.mylibrary.httpUtils.http.live.bean;

public class GetCloseHostroomInfo {


    /**
     * code : 200
     * msg : 查询成功
     * data : {"sex":1,"follow_count":0,"head_url":"http://local.images.ylqzb.com/head/201911/20191111/5dc8b926c98d6.png","u_id":1537,"nick_name":"mc","look_count":8,"is_follow":1,"user_level":1,"user_level_name":"等级一","user_level_icon_url":"","user_level_color":"","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}
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
         * sex : 1
         * follow_count : 0
         * head_url : http://local.images.ylqzb.com/head/201911/20191111/5dc8b926c98d6.png
         * u_id : 1537
         * nick_name : mc
         * look_count : 8
         * is_follow : 1
         * user_level : 1
         * user_level_name : 等级一
         * user_level_icon_url :
         * user_level_color :
         * host_level : 1
         * host_level_name : 等级一
         * host_level_icon_url :
         */

        private int sex;
        private int follow_count;
        private String head_url;
        private int u_id;
        private String nick_name;
        private int look_count;
        private int is_follow;
        private int user_level;
        private String user_level_name;
        private String user_level_icon_url;
        private String user_level_color;
        private int host_level;
        private String host_level_name;
        private String host_level_icon_url;

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getFollow_count() {
            return follow_count;
        }

        public void setFollow_count(int follow_count) {
            this.follow_count = follow_count;
        }

        public String getHead_url() {
            return head_url;
        }

        public void setHead_url(String head_url) {
            this.head_url = head_url;
        }

        public int getU_id() {
            return u_id;
        }

        public void setU_id(int u_id) {
            this.u_id = u_id;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public int getLook_count() {
            return look_count;
        }

        public void setLook_count(int look_count) {
            this.look_count = look_count;
        }

        public int getIs_follow() {
            return is_follow;
        }

        public void setIs_follow(int is_follow) {
            this.is_follow = is_follow;
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
