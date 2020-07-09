package com.example.mylibrary.httpUtils.http.user.bean;

public class UserInfo {

    /**
     * code : 200
     * msg : 查询成功
     * data : {"is_follow":0,"rongyun_token":"fP1sF7ljFcVNVm4ybEa6xNFCtpD8V/eG3SFH7+y+JEb15LZXRPWVaFY55+zPFqyTQoZkwsuJl8slf/gZRBW5fQ==","yu_num":0,"sex":2,"fans_count":3,"follow_count":37,"user_experience_count":156,"host_experience_count":200,"u_id":1534,"head_url":"http://local.images.ylqzb.com/head/201911/18/5dd215000800e.png","nick_name":"ylq15729348082396","signature":"","homepage_background_pic":"","city_name":"暂时保密","user_diamond_total_spend_count":1365,"host_pc_gold_total_earn_count":348526,"user_use_gift_total_integral_count":0,"host_pc_gift_total_eran_integral_count":30906,"live_status":1,"user_level":2,"user_level_name":"level2","user_level_icon_url":"http://local.images.ylqzb.com/level/user/2@2x.png","user_level_color":"#36c092","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}
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
         * is_follow : 0
         * rongyun_token : fP1sF7ljFcVNVm4ybEa6xNFCtpD8V/eG3SFH7+y+JEb15LZXRPWVaFY55+zPFqyTQoZkwsuJl8slf/gZRBW5fQ==
         * yu_num : 0
         * sex : 2
         * fans_count : 3
         * follow_count : 37
         * user_experience_count : 156
         * host_experience_count : 200
         * u_id : 1534
         * head_url : http://local.images.ylqzb.com/head/201911/18/5dd215000800e.png
         * nick_name : ylq15729348082396
         * signature :
         * homepage_background_pic :
         * city_name : 暂时保密
         * user_diamond_total_spend_count : 1365
         * host_pc_gold_total_earn_count : 348526
         * user_use_gift_total_integral_count : 0
         * host_pc_gift_total_eran_integral_count : 30906
         * live_status : 1
         * user_level : 2
         * user_level_name : level2
         * user_level_icon_url : http://local.images.ylqzb.com/level/user/2@2x.png
         * user_level_color : #36c092
         * host_level : 1
         * host_level_name : 等级一
         * host_level_icon_url :
         */

        private int is_follow;
        private String rongyun_token;
        private int yu_num;
        private int sex;
        private int fans_count;
        private int follow_count;
        private int user_experience_count;
        private int host_experience_count;
        private int u_id;
        private String head_url;
        private String nick_name;
        private String signature;
        private String homepage_background_pic;
        private String city_name;
        private int user_diamond_total_spend_count;
        private int host_pc_gold_total_earn_count;
        private int user_use_gift_total_integral_count;
        private int host_pc_gift_total_eran_integral_count;
        private int live_status;
        private int user_level;
        private int mobile_status;
        private int is_certification;
        private String user_level_name;
        private String user_level_icon_url;
        private String user_level_color;
        private int host_level;
        private String host_level_name;
        private String host_level_icon_url;
        private String user_integral_balance_count;
        private String user_diamond_balance_count;

        public int getMobile_status() {
            return mobile_status;
        }

        public void setMobile_status(int mobile_status) {
            this.mobile_status = mobile_status;
        }

        public int getIs_certification() {
            return is_certification;
        }

        public void setIs_certification(int is_certification) {
            this.is_certification = is_certification;
        }

        public String getUser_integral_balance_count() {
            return user_integral_balance_count;
        }

        public void setUser_integral_balance_count(String user_integral_balance_count) {
            this.user_integral_balance_count = user_integral_balance_count;
        }

        public String getUser_diamond_balance_count() {
            return user_diamond_balance_count;
        }

        public void setUser_diamond_balance_count(String user_diamond_balance_count) {
            this.user_diamond_balance_count = user_diamond_balance_count;
        }

        public int getIs_follow() {
            return is_follow;
        }

        public void setIs_follow(int is_follow) {
            this.is_follow = is_follow;
        }

        public String getRongyun_token() {
            return rongyun_token;
        }

        public void setRongyun_token(String rongyun_token) {
            this.rongyun_token = rongyun_token;
        }

        public int getYu_num() {
            return yu_num;
        }

        public void setYu_num(int yu_num) {
            this.yu_num = yu_num;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getFans_count() {
            return fans_count;
        }

        public void setFans_count(int fans_count) {
            this.fans_count = fans_count;
        }

        public int getFollow_count() {
            return follow_count;
        }

        public void setFollow_count(int follow_count) {
            this.follow_count = follow_count;
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

        public int getU_id() {
            return u_id;
        }

        public void setU_id(int u_id) {
            this.u_id = u_id;
        }

        public String getHead_url() {
            return head_url;
        }

        public void setHead_url(String head_url) {
            this.head_url = head_url;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getHomepage_background_pic() {
            return homepage_background_pic;
        }

        public void setHomepage_background_pic(String homepage_background_pic) {
            this.homepage_background_pic = homepage_background_pic;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public int getUser_diamond_total_spend_count() {
            return user_diamond_total_spend_count;
        }

        public void setUser_diamond_total_spend_count(int user_diamond_total_spend_count) {
            this.user_diamond_total_spend_count = user_diamond_total_spend_count;
        }

        public int getHost_pc_gold_total_earn_count() {
            return host_pc_gold_total_earn_count;
        }

        public void setHost_pc_gold_total_earn_count(int host_pc_gold_total_earn_count) {
            this.host_pc_gold_total_earn_count = host_pc_gold_total_earn_count;
        }

        public int getUser_use_gift_total_integral_count() {
            return user_use_gift_total_integral_count;
        }

        public void setUser_use_gift_total_integral_count(int user_use_gift_total_integral_count) {
            this.user_use_gift_total_integral_count = user_use_gift_total_integral_count;
        }

        public int getHost_pc_gift_total_eran_integral_count() {
            return host_pc_gift_total_eran_integral_count;
        }

        public void setHost_pc_gift_total_eran_integral_count(int host_pc_gift_total_eran_integral_count) {
            this.host_pc_gift_total_eran_integral_count = host_pc_gift_total_eran_integral_count;
        }

        public int getLive_status() {
            return live_status;
        }

        public void setLive_status(int live_status) {
            this.live_status = live_status;
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
