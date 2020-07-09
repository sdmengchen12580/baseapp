package com.example.mylibrary.httpUtils.http.live.bean;

import java.util.List;

public class GetLivelist {

    private String code;
    private String msg;
    private DataBean
            data;
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

        private int is_page;
        private List<ListBean> list;
        private List<BannerBean> banner;
        private List<TypelistBean> typelist;
        private List<HostRankingBean> host_ranking;
        private List<UserRankingBean> user_ranking;

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

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<TypelistBean> getTypelist() {
            return typelist;
        }

        public void setTypelist(List<TypelistBean> typelist) {
            this.typelist = typelist;
        }

        public List<HostRankingBean> getHost_ranking() {
            return host_ranking;
        }

        public void setHost_ranking(List<HostRankingBean> host_ranking) {
            this.host_ranking = host_ranking;
        }

        public List<UserRankingBean> getUser_ranking() {
            return user_ranking;
        }

        public void setUser_ranking(List<UserRankingBean> user_ranking) {
            this.user_ranking = user_ranking;
        }

        public static class ListBean {
            /**
             * u_id : 4
             * room_title : 颜值主播
             * look_count : 0
             * pic_url :
             * icon_url :
             */

            private int u_id;
            private String room_title;
            private int look_count;
            private String pic_url;
            private String icon_url;

            public int getU_id() {
                return u_id;
            }

            public void setU_id(int u_id) {
                this.u_id = u_id;
            }

            public String getRoom_title() {
                return room_title;
            }

            public void setRoom_title(String room_title) {
                this.room_title = room_title;
            }

            public int getLook_count() {
                return look_count;
            }

            public void setLook_count(int look_count) {
                this.look_count = look_count;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }
        }

        public static class BannerBean {
            /**
             * title : 测试banner
             * pic_url : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573624774428&di=63927be48e721b740ed2112a688e0f23&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F018c985837fb53a801219c77022553.jpg%402o.jpg
             * link_url :
             */

            private String title;
            private String pic_url;
            private String link_url;
            private int show_type;

            public int getShow_type() {
                return show_type;
            }

            public void setShow_type(int type) {
                this.show_type = type;
            }

            public BannerBean(String title, String pic_url, String link_url,int type) {
                this.title = title;
                this.pic_url = pic_url;
                this.link_url = link_url;
                this.show_type = type;
            }

            public BannerBean(String title, String pic_url, String link_url) {
                this.title = title;
                this.pic_url = pic_url;
                this.link_url = link_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getLink_url() {
                return link_url;
            }

            public void setLink_url(String link_url) {
                this.link_url = link_url;
            }
        }

        public static class TypelistBean {
            /**
             * t_id : 1
             * live_type_name : 颜值
             * pic_url : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3230411255,3618839240&fm=26&gp=0.jpg
             */

            private int t_id;
            private String live_type_name;
            private String pic_url;

            public int getT_id() {
                return t_id;
            }

            public void setT_id(int t_id) {
                this.t_id = t_id;
            }

            public String getLive_type_name() {
                return live_type_name;
            }

            public void setLive_type_name(String live_type_name) {
                this.live_type_name = live_type_name;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }
        }

        public static class HostRankingBean {
            /**
             * live_status : 1
             * intotal_amount : 10
             * u_id : 1538
             * head_url : https://img3.duitang.com/uploads/item/201507/23/20150723115018_ma428.thumb.700_0.jpeg
             * nick_name : ylq15730041709838
             * user_experience_count : 0
             * host_experience_count : 0
             * user_level : 1
             * user_level_name : 等级一
             * user_level_icon_url :
             * host_level : 1
             * host_level_name : 等级一
             * host_level_icon_url :
             */

            private int live_status;
            private String intotal_amount;
            private int u_id;
            private String head_url;
            private String nick_name;
            private int user_experience_count;
            private int host_experience_count;
            private int user_level;
            private String user_level_name;
            private String user_level_icon_url;
            private int host_level;
            private String host_level_name;
            private String host_level_icon_url;

            public int getLive_status() {
                return live_status;
            }

            public void setLive_status(int live_status) {
                this.live_status = live_status;
            }

            public String getIntotal_amount() {
                return intotal_amount;
            }

            public void setIntotal_amount(String intotal_amount) {
                this.intotal_amount = intotal_amount;
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

        public static class UserRankingBean {
            /**
             * live_status : 1
             * intotal_amount : 10
             * u_id : 1537
             * head_url : http://local.images.ylqzb.com/head/201911/20191111/5dc8b926c98d6.png
             * nick_name : mc
             * user_experience_count : 0
             * host_experience_count : 0
             * user_level : 1
             * user_level_name : 等级一
             * user_level_icon_url :
             * host_level : 1
             * host_level_name : 等级一
             * host_level_icon_url :
             */

            private int live_status;
            private String intotal_amount;
            private int u_id;
            private String head_url;
            private String nick_name;
            private int user_experience_count;
            private int host_experience_count;
            private int user_level;
            private String user_level_name;
            private String user_level_icon_url;
            private int host_level;
            private String host_level_name;
            private String host_level_icon_url;

            public int getLive_status() {
                return live_status;
            }

            public void setLive_status(int live_status) {
                this.live_status = live_status;
            }

            public String getIntotal_amount() {
                return intotal_amount;
            }

            public void setIntotal_amount(String intotal_amount) {
                this.intotal_amount = intotal_amount;
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
