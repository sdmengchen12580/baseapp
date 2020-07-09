package com.example.mylibrary.httpUtils.http.Pay.bean;

public class AlipayBean {


    /**
     * code : 200
     * msg : 成功
     * data : {"result":"alipay_sdk=alipay-sdk-php-easyalipay-20190926&app_id=2019102560037324&biz_content=%22%7B%5C%22total_amount%5C%22%3A0%2C%5C%22body%5C%22%3A%5C%22%5C%5Cu8ba2%5C%5Cu5355%5C%5Cu53f7201912141229458158535814%5C%22%2C%5C%22subject%5C%22%3A%5C%2210%5C%5Cu4e2a%5C%5Cu94bb%5C%5Cu77f3%5C%22%2C%5C%22out_trade_no%5C%22%3A%5C%22201912141229458158535814%5C%22%2C%5C%22timeout_express%5C%22%3A%5C%2230m%5C%22%7D%22&charset=utf-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2F&sign_type=RSA2&timestamp=2019-12-14+12%3A29%3A45&version=1.0&sign=rhGvryhKRZOleLVu94kJ8PJ4gz59Ucuxh0lzSTmtNuRki4l5mqKRppbaldaOsAHxi1EGLSrXH2nLEnZBsObVMvv93%2BtmCKoFzsf3TR0VxarjVbjlvTcShTZ6Xflm59C3qBpojY2HEMBZtm0U0mGlKjB0rEm2Askp7wnqB9ul2nHEv67iJ%2BKvGhLqYhKhZw4%2Bchy%2BEuY%2FElX5kfjdi5pYQAUUyt8Iv35SFFeIHLj9Wf55f6xAuEWQc%2FoTobEK%2BQgUE83ixktSBVBNOzClHzLWRtpSd2mTB5MCkvOPNwOwP9%2FPB7%2FWXPayWG2TD86nAP%2BOcVtPVmY0ZJSWIDxjh%2FGWeA%3D%3D","order_num":"201912141229458158535814"}
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
         * result : alipay_sdk=alipay-sdk-php-easyalipay-20190926&app_id=2019102560037324&biz_content=%22%7B%5C%22total_amount%5C%22%3A0%2C%5C%22body%5C%22%3A%5C%22%5C%5Cu8ba2%5C%5Cu5355%5C%5Cu53f7201912141229458158535814%5C%22%2C%5C%22subject%5C%22%3A%5C%2210%5C%5Cu4e2a%5C%5Cu94bb%5C%5Cu77f3%5C%22%2C%5C%22out_trade_no%5C%22%3A%5C%22201912141229458158535814%5C%22%2C%5C%22timeout_express%5C%22%3A%5C%2230m%5C%22%7D%22&charset=utf-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2F&sign_type=RSA2&timestamp=2019-12-14+12%3A29%3A45&version=1.0&sign=rhGvryhKRZOleLVu94kJ8PJ4gz59Ucuxh0lzSTmtNuRki4l5mqKRppbaldaOsAHxi1EGLSrXH2nLEnZBsObVMvv93%2BtmCKoFzsf3TR0VxarjVbjlvTcShTZ6Xflm59C3qBpojY2HEMBZtm0U0mGlKjB0rEm2Askp7wnqB9ul2nHEv67iJ%2BKvGhLqYhKhZw4%2Bchy%2BEuY%2FElX5kfjdi5pYQAUUyt8Iv35SFFeIHLj9Wf55f6xAuEWQc%2FoTobEK%2BQgUE83ixktSBVBNOzClHzLWRtpSd2mTB5MCkvOPNwOwP9%2FPB7%2FWXPayWG2TD86nAP%2BOcVtPVmY0ZJSWIDxjh%2FGWeA%3D%3D
         * order_num : 201912141229458158535814
         */

        private String result;
        private String order_num;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getOrder_num() {
            return order_num;
        }

        public void setOrder_num(String order_num) {
            this.order_num = order_num;
        }
    }
}
