package com.example.mylibrary.httpUtils.http.live.bean;

public class EnterHostRoom {


    private String error_code;
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
        private int yu_num;
        private int host_u_id;
        private int log_id;
        private int integral_count;
        private int earn;
        private String room_notice;
        private String chat_room_id;
        private int look_count;
        private String pic_url;
        private int fans_count;
        private String room_title;
        private int live_status;
        private String nick_name;
        private String head_url;
        private int host_pc_gold_total_earn_count;
        private int host_pc_gift_total_eran_integral_count;
        private int user_level;
        private String user_level_name;
        private String user_level_icon_url;
        private String user_level_color;
        private int host_level;
        private String host_level_name;
        private String host_level_icon_url;
        private int user_diamond_balance_count;
        private int user_integral_balance_count;
        private int host_integral_count;
        private int host_earn;
        private String play_rtmp;
        private int is_follow;
        private int is_room_admin;
        private int is_nospeak;
        private int is_out;
        private ShopBean shop;
        private ShareBean share;
        private NoticeBean notice;

        public int getYu_num() {
            return yu_num;
        }

        public void setYu_num(int yu_num) {
            this.yu_num = yu_num;
        }

        public int getHost_u_id() {
            return host_u_id;
        }

        public void setHost_u_id(int host_u_id) {
            this.host_u_id = host_u_id;
        }

        public int getLog_id() {
            return log_id;
        }

        public void setLog_id(int log_id) {
            this.log_id = log_id;
        }

        public int getIntegral_count() {
            return integral_count;
        }

        public void setIntegral_count(int integral_count) {
            this.integral_count = integral_count;
        }

        public int getEarn() {
            return earn;
        }

        public void setEarn(int earn) {
            this.earn = earn;
        }

        public String getRoom_notice() {
            return room_notice;
        }

        public void setRoom_notice(String room_notice) {
            this.room_notice = room_notice;
        }

        public String getChat_room_id() {
            return chat_room_id;
        }

        public void setChat_room_id(String chat_room_id) {
            this.chat_room_id = chat_room_id;
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

        public int getFans_count() {
            return fans_count;
        }

        public void setFans_count(int fans_count) {
            this.fans_count = fans_count;
        }

        public String getRoom_title() {
            return room_title;
        }

        public void setRoom_title(String room_title) {
            this.room_title = room_title;
        }

        public int getLive_status() {
            return live_status;
        }

        public void setLive_status(int live_status) {
            this.live_status = live_status;
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

        public int getHost_pc_gold_total_earn_count() {
            return host_pc_gold_total_earn_count;
        }

        public void setHost_pc_gold_total_earn_count(int host_pc_gold_total_earn_count) {
            this.host_pc_gold_total_earn_count = host_pc_gold_total_earn_count;
        }

        public int getHost_pc_gift_total_eran_integral_count() {
            return host_pc_gift_total_eran_integral_count;
        }

        public void setHost_pc_gift_total_eran_integral_count(int host_pc_gift_total_eran_integral_count) {
            this.host_pc_gift_total_eran_integral_count = host_pc_gift_total_eran_integral_count;
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

        public int getUser_diamond_balance_count() {
            return user_diamond_balance_count;
        }

        public void setUser_diamond_balance_count(int user_diamond_balance_count) {
            this.user_diamond_balance_count = user_diamond_balance_count;
        }

        public int getUser_integral_balance_count() {
            return user_integral_balance_count;
        }

        public void setUser_integral_balance_count(int user_integral_balance_count) {
            this.user_integral_balance_count = user_integral_balance_count;
        }

        public int getHost_integral_count() {
            return host_integral_count;
        }

        public void setHost_integral_count(int host_integral_count) {
            this.host_integral_count = host_integral_count;
        }

        public int getHost_earn() {
            return host_earn;
        }

        public void setHost_earn(int host_earn) {
            this.host_earn = host_earn;
        }

        public String getPlay_rtmp() {
            return play_rtmp;
        }

        public void setPlay_rtmp(String play_rtmp) {
            this.play_rtmp = play_rtmp;
        }

        public int getIs_follow() {
            return is_follow;
        }

        public void setIs_follow(int is_follow) {
            this.is_follow = is_follow;
        }

        public int getIs_room_admin() {
            return is_room_admin;
        }

        public void setIs_room_admin(int is_room_admin) {
            this.is_room_admin = is_room_admin;
        }

        public int getIs_nospeak() {
            return is_nospeak;
        }

        public void setIs_nospeak(int is_nospeak) {
            this.is_nospeak = is_nospeak;
        }

        public int getIs_out() {
            return is_out;
        }

        public void setIs_out(int is_out) {
            this.is_out = is_out;
        }

        public ShopBean getShop() {
            return shop;
        }

        public void setShop(ShopBean shop) {
            this.shop = shop;
        }

        public ShareBean getShare() {
            return share;
        }

        public void setShare(ShareBean share) {
            this.share = share;
        }

        public NoticeBean getNotice() {
            return notice;
        }

        public void setNotice(NoticeBean notice) {
            this.notice = notice;
        }

        public static class ShopBean {
            /**
             * s_id : 9
             * shop_name : 巴九门老火锅
             * pic_url : https://images.ylqzb.com/shop/201912/20/5dfc9355da588.png
             */

            private int s_id;
            private String shop_name;
            private String pic_url;

            public int getS_id() {
                return s_id;
            }

            public void setS_id(int s_id) {
                this.s_id = s_id;
            }

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }
        }

        public static class ShareBean {

            private String pic_url;
            private String title;
            private String desc;
            private String http_url;

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getHttp_url() {
                return http_url;
            }

            public void setHttp_url(String http_url) {
                this.http_url = http_url;
            }
        }

        public static class NoticeBean {
            /**
             * title : 系统公告
             * msg : 鱼络圈提倡绿色直播环境，对封面和直播内容24小时巡查，任何违法违规、色情暴力、抹黑诋毁，低俗不良行为将被封停账号。文明直播，从我做起
             */

            private String title;
            private String msg;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }
        }
    }
}
