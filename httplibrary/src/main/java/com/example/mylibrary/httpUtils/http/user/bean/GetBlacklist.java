package com.example.mylibrary.httpUtils.http.user.bean;

import java.util.List;

public class GetBlacklist {

    private String error_code;
    /**
     * code : 200
     * msg :
     * data : {"is_page":0,"list":[{"add_time":1575860757,"u_id":1540,"nick_name":"Conney","head_url":"http://thirdqq.qlogo.cn/g?b=oidb&k=cpRpiaTiclRBjNDicqOKNzLWw&s=100&t=1557041889","sex":1,"yu_num":0,"signature":"","user_experience_count":100,"host_experience_count":200,"user_level":2,"user_level_name":"level2","user_level_icon_url":"http://local.images.ylqzb.com/level/user/2@2x.png","host_level":1,"host_level_name":"等级一","host_level_icon_url":""},{"add_time":1575860757,"u_id":1538,"nick_name":"ylq15730041709838","head_url":"https://img3.duitang.com/uploads/item/201507/23/20150723115018_ma428.thumb.700_0.jpeg","sex":0,"yu_num":0,"signature":"","user_experience_count":300,"host_experience_count":200,"user_level":3,"user_level_name":"level3","user_level_icon_url":"http://local.images.ylqzb.com/level/user/3@2x.png","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}]}
     */

    private String code;
    private String msg;
    private DataBean data;

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
         * is_page : 0
         * list : [{"add_time":1575860757,"u_id":1540,"nick_name":"Conney","head_url":"http://thirdqq.qlogo.cn/g?b=oidb&k=cpRpiaTiclRBjNDicqOKNzLWw&s=100&t=1557041889","sex":1,"yu_num":0,"signature":"","user_experience_count":100,"host_experience_count":200,"user_level":2,"user_level_name":"level2","user_level_icon_url":"http://local.images.ylqzb.com/level/user/2@2x.png","host_level":1,"host_level_name":"等级一","host_level_icon_url":""},{"add_time":1575860757,"u_id":1538,"nick_name":"ylq15730041709838","head_url":"https://img3.duitang.com/uploads/item/201507/23/20150723115018_ma428.thumb.700_0.jpeg","sex":0,"yu_num":0,"signature":"","user_experience_count":300,"host_experience_count":200,"user_level":3,"user_level_name":"level3","user_level_icon_url":"http://local.images.ylqzb.com/level/user/3@2x.png","host_level":1,"host_level_name":"等级一","host_level_icon_url":""}]
         */

        private int is_page;
        private List<ListBean> list;

        public int getIs_page() {
            return is_page;
        }

        public void setIs_page(int is_page) {
            this.is_page = is_page;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * add_time : 1575860757
             * u_id : 1540
             * nick_name : Conney
             * head_url : http://thirdqq.qlogo.cn/g?b=oidb&k=cpRpiaTiclRBjNDicqOKNzLWw&s=100&t=1557041889
             * sex : 1
             * yu_num : 0
             * signature :
             * user_experience_count : 100
             * host_experience_count : 200
             * user_level : 2
             * user_level_name : level2
             * user_level_icon_url : http://local.images.ylqzb.com/level/user/2@2x.png
             * host_level : 1
             * host_level_name : 等级一
             * host_level_icon_url :
             */

            private int add_time;
            private int u_id;
            private String nick_name;
            private String head_url;
            private int sex;
            private int yu_num;
            private String signature;
            private int user_experience_count;
            private int host_experience_count;
            private int user_level;
            private String user_level_name;
            private String user_level_icon_url;
            private int host_level;
            private String host_level_name;
            private String host_level_icon_url;

            public int getAdd_time() {
                return add_time;
            }

            public void setAdd_time(int add_time) {
                this.add_time = add_time;
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

            public int getYu_num() {
                return yu_num;
            }

            public void setYu_num(int yu_num) {
                this.yu_num = yu_num;
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
}
