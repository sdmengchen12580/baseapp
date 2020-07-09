package com.example.mylibrary.httpUtils.http.gift.bean;

import java.util.List;

public class GetGiftlist {

    private String error_code;
    /**
     * code : 200
     * msg : 查询成功
     * data : [{"t_id":1,"type_name":"普通","giftlist":[{"id":1,"gift_name":"爱心","pay_type":1,"price":1,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":["1","30","99","200"]},{"id":2,"gift_name":"爱心","pay_type":1,"price":2,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":3,"gift_name":"爱心","pay_type":1,"price":3,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":4,"gift_name":"爱心","pay_type":1,"price":4,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":5,"gift_name":"爱心","pay_type":1,"price":5,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":6,"gift_name":"爱心","pay_type":1,"price":6,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]}]},{"t_id":2,"type_name":"豪华","giftlist":[{"id":7,"gift_name":"爱心","pay_type":2,"price":7,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":8,"gift_name":"爱心","pay_type":2,"price":8,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":9,"gift_name":"爱心","pay_type":2,"price":9,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]}]}]
     */

    private String code;
    private String msg;
    private List<DataBean> data;

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
         * t_id : 1
         * type_name : 普通
         * giftlist : [{"id":1,"gift_name":"爱心","pay_type":1,"price":1,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":["1","30","99","200"]},{"id":2,"gift_name":"爱心","pay_type":1,"price":2,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":3,"gift_name":"爱心","pay_type":1,"price":3,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":4,"gift_name":"爱心","pay_type":1,"price":4,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":5,"gift_name":"爱心","pay_type":1,"price":5,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]},{"id":6,"gift_name":"爱心","pay_type":1,"price":6,"icon_url":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg","effect_type":1,"svga_url":"","count_object":[1]}]
         */

        private int t_id;
        private String type_name;
        private List<GiftlistBean> giftlist;

        public int getT_id() {
            return t_id;
        }

        public void setT_id(int t_id) {
            this.t_id = t_id;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public List<GiftlistBean> getGiftlist() {
            return giftlist;
        }

        public void setGiftlist(List<GiftlistBean> giftlist) {
            this.giftlist = giftlist;
        }

        public static class GiftlistBean {
            /**
             * id : 1
             * gift_name : 爱心
             * pay_type : 1
             * price : 1
             * icon_url : https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2795530190,3686903136&fm=26&gp=0.jpg
             * effect_type : 1
             * svga_url :
             * count_object : ["1","30","99","200"]
             */

            private int id;
            private String gift_name;
            private int pay_type;
            private int price;
            private String icon_url;
            private int effect_type;
            private String svga_url;
            private List<String> count_object;
            private boolean selected;

            public boolean isSelected() {
                return selected;
            }

            public void setSelected(boolean selected) {
                this.selected = selected;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGift_name() {
                return gift_name;
            }

            public void setGift_name(String gift_name) {
                this.gift_name = gift_name;
            }

            public int getPay_type() {
                return pay_type;
            }

            public void setPay_type(int pay_type) {
                this.pay_type = pay_type;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public int getEffect_type() {
                return effect_type;
            }

            public void setEffect_type(int effect_type) {
                this.effect_type = effect_type;
            }

            public String getSvga_url() {
                return svga_url;
            }

            public void setSvga_url(String svga_url) {
                this.svga_url = svga_url;
            }

            public List<String> getCount_object() {
                return count_object;
            }

            public void setCount_object(List<String> count_object) {
                this.count_object = count_object;
            }
        }
    }
}
