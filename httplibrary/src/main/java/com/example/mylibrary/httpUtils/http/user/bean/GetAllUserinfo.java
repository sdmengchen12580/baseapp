package com.example.mylibrary.httpUtils.http.user.bean;

import java.util.List;

public class GetAllUserinfo {


    /**
     * code : 200
     * msg : 查询成功
     * data : [{"u_id":1567,"head_url":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKzvq5AqMRD6OXLSHZAY2pQ3OG1HYOichxM2JSSalnPnZurOvJiaFIn65o51G1GGcYic8J1ibhzcicfk3g/132","nick_name":"mc","sex":1}]
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
         * u_id : 1567
         * head_url : http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKzvq5AqMRD6OXLSHZAY2pQ3OG1HYOichxM2JSSalnPnZurOvJiaFIn65o51G1GGcYic8J1ibhzcicfk3g/132
         * nick_name : mc
         * sex : 1
         */

        private int u_id;
        private String head_url;
        private String nick_name;
        private int sex;

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

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }
}
