package com.example.mylibrary.httpUtils.http.live.bean;

import java.util.List;

public class FollowLiveHost {

    /**
     * code : 200
     * msg : 查询成功
     * data : [{"u_id":1537,"pic_url":"http://local.images.ylqzb.com/live/201911/11/5dc948d4f0aac.png","room_title":"主播带你搞事情","look_count":15}]
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
         * u_id : 1537
         * pic_url : http://local.images.ylqzb.com/live/201911/11/5dc948d4f0aac.png
         * room_title : 主播带你搞事情
         * look_count : 15
         */

        private int u_id;
        private String pic_url;
        private String room_title;
        private int look_count;

        public int getU_id() {
            return u_id;
        }

        public void setU_id(int u_id) {
            this.u_id = u_id;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
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
    }
}
