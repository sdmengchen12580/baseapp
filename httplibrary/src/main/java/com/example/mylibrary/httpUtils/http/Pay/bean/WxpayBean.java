package com.example.mylibrary.httpUtils.http.Pay.bean;

import com.google.gson.annotations.SerializedName;

public class WxpayBean {


    /**
     * code : 200
     * msg :
     * data : {"appid":"wxd3c035d347218b30","noncestr":"bbSWRsIANSiuhg37XuoV1b8otYwI32uE","package":"Sign=WXPay","partnerid":"1560421001","prepayid":"wx141348243606877c89d1e0fc1163059400","timestamp":1576302504,"sign":"3513718E853D4B386EEABA03611D1896","order_num":"201912141348244412196130"}
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
         * appid : wxd3c035d347218b30
         * noncestr : bbSWRsIANSiuhg37XuoV1b8otYwI32uE
         * package : Sign=WXPay
         * partnerid : 1560421001
         * prepayid : wx141348243606877c89d1e0fc1163059400
         * timestamp : 1576302504
         * sign : 3513718E853D4B386EEABA03611D1896
         * order_num : 201912141348244412196130
         */

        private String appid;
        private String noncestr;
        @SerializedName("package")
        private String packageX;
        private String partnerid;
        private String prepayid;
        private int timestamp;
        private String sign;
        private String order_num;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getNoncestr() {
            return noncestr;
        }

        public void setNoncestr(String noncestr) {
            this.noncestr = noncestr;
        }

        public String getPackageX() {
            return packageX;
        }

        public void setPackageX(String packageX) {
            this.packageX = packageX;
        }

        public String getPartnerid() {
            return partnerid;
        }

        public void setPartnerid(String partnerid) {
            this.partnerid = partnerid;
        }

        public String getPrepayid() {
            return prepayid;
        }

        public void setPrepayid(String prepayid) {
            this.prepayid = prepayid;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getOrder_num() {
            return order_num;
        }

        public void setOrder_num(String order_num) {
            this.order_num = order_num;
        }
    }
}
