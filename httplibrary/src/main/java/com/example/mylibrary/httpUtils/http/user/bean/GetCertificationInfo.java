package com.example.mylibrary.httpUtils.http.user.bean;

public class GetCertificationInfo {

    private String error_code;
    /**
     * code : 200
     * msg : 查询成功
     * data : {"true_name":"随便输","id_num":"320121199412144119","id_pic_url":""}
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
         * true_name : 随便输
         * id_num : 320121199412144119
         * id_pic_url :
         */

        private String true_name;
        private String id_num;
        private String id_pic_url;

        public String getTrue_name() {
            return true_name;
        }

        public void setTrue_name(String true_name) {
            this.true_name = true_name;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getId_pic_url() {
            return id_pic_url;
        }

        public void setId_pic_url(String id_pic_url) {
            this.id_pic_url = id_pic_url;
        }
    }
}
