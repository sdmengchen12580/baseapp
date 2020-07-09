package com.example.mylibrary.httpUtils.http.live.bean;

import java.util.List;

public class GetNearbyLivelist {

    /**
     * code : 200
     * msg :
     * data : {"is_page":0,"list":[{"u_id":1538,"room_title":"主播带你搞事情","look_count":0,"pic_url":"http://local.images.ylqzb.com/live/201911/11/5dc954eaf0621.png","icon_url":"","distance":0.32},{"u_id":1537,"room_title":"主播带你搞事情","look_count":14,"pic_url":"http://local.images.ylqzb.com/live/201911/11/5dc948d4f0aac.png","icon_url":"","distance":0.33}]}
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
         * is_page : 0
         * list : [{"u_id":1538,"room_title":"主播带你搞事情","look_count":0,"pic_url":"http://local.images.ylqzb.com/live/201911/11/5dc954eaf0621.png","icon_url":"","distance":0.32},{"u_id":1537,"room_title":"主播带你搞事情","look_count":14,"pic_url":"http://local.images.ylqzb.com/live/201911/11/5dc948d4f0aac.png","icon_url":"","distance":0.33}]
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
             * u_id : 1538
             * room_title : 主播带你搞事情
             * look_count : 0
             * pic_url : http://local.images.ylqzb.com/live/201911/11/5dc954eaf0621.png
             * icon_url :
             * distance : 0.32
             */

            private int u_id;
            private String room_title;
            private int look_count;
            private String pic_url;
            private String icon_url;
            private String distance;

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

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }
        }
    }
}
