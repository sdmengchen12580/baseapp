package com.example.mylibrary.httpUtils.http.app.bean;

import java.util.List;

public class GetRechargePackage {


    /**
     * code : 200
     * msg : 查询成功
     * data : {"recharge_tips":"","list":[{"id":1,"price":"0.01","diamond_count":10,"integral_count":1,"apple_product_id":""},{"id":2,"price":"0.01","diamond_count":20,"integral_count":2,"apple_product_id":""},{"id":3,"price":"0.01","diamond_count":30,"integral_count":3,"apple_product_id":""},{"id":4,"price":"0.01","diamond_count":40,"integral_count":4,"apple_product_id":""},{"id":5,"price":"0.01","diamond_count":50,"integral_count":5,"apple_product_id":""},{"id":6,"price":"0.01","diamond_count":60,"integral_count":6,"apple_product_id":""},{"id":7,"price":"0.01","diamond_count":70,"integral_count":7,"apple_product_id":""},{"id":8,"price":"0.01","diamond_count":80,"integral_count":8,"apple_product_id":""},{"id":9,"price":"0.01","diamond_count":90,"integral_count":8,"apple_product_id":""}]}
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
         * recharge_tips :
         * list : [{"id":1,"price":"0.01","diamond_count":10,"integral_count":1,"apple_product_id":""},{"id":2,"price":"0.01","diamond_count":20,"integral_count":2,"apple_product_id":""},{"id":3,"price":"0.01","diamond_count":30,"integral_count":3,"apple_product_id":""},{"id":4,"price":"0.01","diamond_count":40,"integral_count":4,"apple_product_id":""},{"id":5,"price":"0.01","diamond_count":50,"integral_count":5,"apple_product_id":""},{"id":6,"price":"0.01","diamond_count":60,"integral_count":6,"apple_product_id":""},{"id":7,"price":"0.01","diamond_count":70,"integral_count":7,"apple_product_id":""},{"id":8,"price":"0.01","diamond_count":80,"integral_count":8,"apple_product_id":""},{"id":9,"price":"0.01","diamond_count":90,"integral_count":8,"apple_product_id":""}]
         */

        private String recharge_tips;
        private List<ListBean> list;

        public String getRecharge_tips() {
            return recharge_tips;
        }

        public void setRecharge_tips(String recharge_tips) {
            this.recharge_tips = recharge_tips;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 1
             * price : 0.01
             * diamond_count : 10
             * integral_count : 1
             * apple_product_id :
             */

            private int id;
            private boolean isSelect;
            private String price;
            private int diamond_count;
            private int integral_count;
            private String apple_product_id;

            public boolean isSelect() {
                return isSelect;
            }

            public void setSelect(boolean select) {
                isSelect = select;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getDiamond_count() {
                return diamond_count;
            }

            public void setDiamond_count(int diamond_count) {
                this.diamond_count = diamond_count;
            }

            public int getIntegral_count() {
                return integral_count;
            }

            public void setIntegral_count(int integral_count) {
                this.integral_count = integral_count;
            }

            public String getApple_product_id() {
                return apple_product_id;
            }

            public void setApple_product_id(String apple_product_id) {
                this.apple_product_id = apple_product_id;
            }
        }
    }
}
