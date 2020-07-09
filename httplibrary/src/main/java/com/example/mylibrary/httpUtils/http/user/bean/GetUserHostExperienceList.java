package com.example.mylibrary.httpUtils.http.user.bean;

import java.util.List;

public class GetUserHostExperienceList {

    /**
     * code : 200
     * msg : 查询成功
     * data : {"user_experience_count":1500,"host_experience_count":280,"task":[{"title":"用户送钻石","pic_url":"","remark":"","experience_type":1},{"title":"用户送积分","pic_url":"","remark":"","experience_type":2},{"title":"用户看直播","pic_url":"","remark":"","experience_type":3},{"title":"用户分享","pic_url":"","remark":"","experience_type":4},{"title":"用户发布动态","pic_url":"","remark":"","experience_type":5},{"title":"用户点赞","pic_url":"","remark":"","experience_type":6},{"title":"用户评论","pic_url":"","remark":"","experience_type":7}],"level":[{"level":1,"level_icon_url":"http://local.images.ylqzb.com/level/user/1@2x.png","level_name":"level1","level_begin":0,"level_end":99},{"level":2,"level_icon_url":"http://local.images.ylqzb.com/level/user/2@2x.png","level_name":"level2","level_begin":100,"level_end":199},{"level":3,"level_icon_url":"http://local.images.ylqzb.com/level/user/3@2x.png","level_name":"level3","level_begin":200,"level_end":999},{"level":4,"level_icon_url":"http://local.images.ylqzb.com/level/user/4@2x.png","level_name":"level4","level_begin":1000,"level_end":9999},{"level":5,"level_icon_url":"http://local.images.ylqzb.com/level/user/5@2x.png","level_name":"level5","level_begin":10000,"level_end":100000000},{"level":6,"level_icon_url":"http://local.images.ylqzb.com/level/user/6@2x.png","level_name":"level6","level_begin":0,"level_end":0},{"level":7,"level_icon_url":"http://local.images.ylqzb.com/level/user/7@2x.png","level_name":"level7","level_begin":0,"level_end":0},{"level":8,"level_icon_url":"http://local.images.ylqzb.com/level/user/8@2x.png","level_name":"level8","level_begin":0,"level_end":0},{"level":9,"level_icon_url":"http://local.images.ylqzb.com/level/user/9@2x.png","level_name":"level9","level_begin":0,"level_end":0},{"level":10,"level_icon_url":"http://local.images.ylqzb.com/level/user/10@2x.png","level_name":"level10","level_begin":0,"level_end":0},{"level":11,"level_icon_url":"http://local.images.ylqzb.com/level/user/11@2x.png","level_name":"level11","level_begin":0,"level_end":0},{"level":12,"level_icon_url":"http://local.images.ylqzb.com/level/user/12@2x.png","level_name":"level12","level_begin":0,"level_end":0},{"level":13,"level_icon_url":"http://local.images.ylqzb.com/level/user/13@2x.png","level_name":"level13","level_begin":0,"level_end":0},{"level":14,"level_icon_url":"http://local.images.ylqzb.com/level/user/14@2x.png","level_name":"level14","level_begin":0,"level_end":0},{"level":15,"level_icon_url":"http://local.images.ylqzb.com/level/user/15@2x.png","level_name":"level15","level_begin":0,"level_end":0},{"level":16,"level_icon_url":"http://local.images.ylqzb.com/level/user/16@2x.png","level_name":"level16","level_begin":0,"level_end":0},{"level":17,"level_icon_url":"http://local.images.ylqzb.com/level/user/17@2x.png","level_name":"level17","level_begin":0,"level_end":0},{"level":18,"level_icon_url":"http://local.images.ylqzb.com/level/user/18@2x.png","level_name":"level18","level_begin":0,"level_end":0},{"level":19,"level_icon_url":"http://local.images.ylqzb.com/level/user/19@2x.png","level_name":"level19","level_begin":0,"level_end":0},{"level":20,"level_icon_url":"http://local.images.ylqzb.com/level/user/20@2x.png","level_name":"level20","level_begin":0,"level_end":0},{"level":21,"level_icon_url":"http://local.images.ylqzb.com/level/user/21@2x.png","level_name":"level21","level_begin":0,"level_end":0},{"level":22,"level_icon_url":"http://local.images.ylqzb.com/level/user/22@2x.png","level_name":"level22","level_begin":0,"level_end":0},{"level":23,"level_icon_url":"http://local.images.ylqzb.com/level/user/23@2x.png","level_name":"level23","level_begin":0,"level_end":0}]}
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

        private long user_experience_count;
        private long host_experience_count;
        private List<TaskBean> task;
        private List<LevelBean> level;

        public long getUser_experience_count() {
            return user_experience_count;
        }

        public void setUser_experience_count(long user_experience_count) {
            this.user_experience_count = user_experience_count;
        }

        public long getHost_experience_count() {
            return host_experience_count;
        }

        public void setHost_experience_count(long host_experience_count) {
            this.host_experience_count = host_experience_count;
        }

        public List<TaskBean> getTask() {
            return task;
        }

        public void setTask(List<TaskBean> task) {
            this.task = task;
        }

        public List<LevelBean> getLevel() {
            return level;
        }

        public void setLevel(List<LevelBean> level) {
            this.level = level;
        }

        public static class TaskBean {
            /**
             * title : 用户送钻石
             * pic_url :
             * remark :
             * experience_type : 1
             */

            private String title;
            private String pic_url;
            private String remark;
            private int experience_type;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int getExperience_type() {
                return experience_type;
            }

            public void setExperience_type(int experience_type) {
                this.experience_type = experience_type;
            }
        }

        public static class LevelBean {
            /**
             * level : 1
             * level_icon_url : http://local.images.ylqzb.com/level/user/1@2x.png
             * level_name : level1
             * level_begin : 0
             * level_end : 99
             */

            private int level;
            private String level_icon_url;
            private String level_name;
            private long level_begin;
            private long level_end;

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getLevel_icon_url() {
                return level_icon_url;
            }

            public void setLevel_icon_url(String level_icon_url) {
                this.level_icon_url = level_icon_url;
            }

            public String getLevel_name() {
                return level_name;
            }

            public void setLevel_name(String level_name) {
                this.level_name = level_name;
            }

            public long getLevel_begin() {
                return level_begin;
            }

            public void setLevel_begin(long level_begin) {
                this.level_begin = level_begin;
            }

            public long getLevel_end() {
                return level_end;
            }

            public void setLevel_end(long level_end) {
                this.level_end = level_end;
            }
        }
    }
}
