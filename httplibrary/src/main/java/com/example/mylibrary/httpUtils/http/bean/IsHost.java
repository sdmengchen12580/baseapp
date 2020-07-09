package com.example.mylibrary.httpUtils.http.bean;

import java.util.List;

public class IsHost {

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

        private String is_open_livetype="0";//频道
        private String is_open_livetag="0";//标签
        private String remark;
        private String true_name;
        private String pic_url;
        private String id_num;
        private String live_pic_url;
        private String fj_cause;
        private String mobile_num;
        private int type;
        private List<String> start_live_title;

        public String getIs_open_livetype() {
            return is_open_livetype;
        }

        public void setIs_open_livetype(String is_open_livetype) {
            this.is_open_livetype = is_open_livetype;
        }

        public String getIs_open_livetag() {
            return is_open_livetag;
        }

        public void setIs_open_livetag(String is_open_livetag) {
            this.is_open_livetag = is_open_livetag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTrue_name() {
            return true_name;
        }

        public void setTrue_name(String true_name) {
            this.true_name = true_name;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getLive_pic_url() {
            return live_pic_url;
        }

        public void setLive_pic_url(String live_pic_url) {
            this.live_pic_url = live_pic_url;
        }

        public String getFj_cause() {
            return fj_cause;
        }

        public void setFj_cause(String fj_cause) {
            this.fj_cause = fj_cause;
        }

        public String getMobile_num() {
            return mobile_num;
        }

        public void setMobile_num(String mobile_num) {
            this.mobile_num = mobile_num;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getStart_live_title() {
            return start_live_title;
        }

        public void setStart_live_title(List<String> start_live_title) {
            this.start_live_title = start_live_title;
        }
    }
}
