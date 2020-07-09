package com.example.mylibrary.httpUtils.http.live.bean;

import java.util.List;

public class GetHostroomUserlist {

    /**
     * code : 200
     * msg : 查询成功
     * data : [{"u_id":1538,"nick_name":"ylq15730041709838","head_url":"https://img3.duitang.com/uploads/item/201507/23/20150723115018_ma428.thumb.700_0.jpeg","sex":0,"signature":"","user_experience_count":0,"host_experience_count":0,"is_follow":1,"user_level":1,"user_level_name":"等级一","user_level_icon_url":"","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}]
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
         * u_id : 1538
         * nick_name : ylq15730041709838
         * head_url : https://img3.duitang.com/uploads/item/201507/23/20150723115018_ma428.thumb.700_0.jpeg
         * sex : 0
         * signature :
         * user_experience_count : 0
         * host_experience_count : 0
         * is_follow : 1
         * user_level : 1
         * user_level_name : 等级一
         * user_level_icon_url :
         * host_level : 1
         * host_level_name : 等级一
         * host_level_icon_url :
         */

        private int u_id;
        private String diamond_count;
        private String nick_name;
        private String head_url;
        private int sex;
        private String signature;
        private int user_experience_count;
        private int host_experience_count;
        private int is_follow;
        private int user_level;
        private String user_level_name;
        private String user_level_icon_url;
        private int host_level;
        private String host_level_name;
        private String host_level_icon_url;

        public String getDiamond_count() {
            return diamond_count;
        }

        public void setDiamond_count(String diamond_count) {
            this.diamond_count = diamond_count;
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

        public String getHead_url() {
            return head_url;
        }

        public void setHead_url(String head_url) {
            this.head_url = head_url;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getUser_experience_count() {
            return user_experience_count;
        }

        public void setUser_experience_count(int user_experience_count) {
            this.user_experience_count = user_experience_count;
        }

        public int getHost_experience_count() {
            return host_experience_count;
        }

        public void setHost_experience_count(int host_experience_count) {
            this.host_experience_count = host_experience_count;
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
