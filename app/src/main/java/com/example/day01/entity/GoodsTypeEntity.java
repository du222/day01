package com.example.day01.entity;

import java.util.List;

public class GoodsTypeEntity {
    private Integer code;
    private String msg;
    private List<DataBean> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
        private Integer id;
        private String category_name;
        private Object category_icon;
        private Integer parent_id;
        private List<DataBean> data;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public Object getCategory_icon() {
            return category_icon;
        }

        public void setCategory_icon(Object category_icon) {
            this.category_icon = category_icon;
        }

        public Integer getParent_id() {
            return parent_id;
        }

        public void setParent_id(Integer parent_id) {
            this.parent_id = parent_id;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class Daen {
            private Integer id;
            private String category_name;
            private String category_icon;
            private Integer parent_id;
            private Object data;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getCategory_icon() {
                return category_icon;
            }

            public void setCategory_icon(String category_icon) {
                this.category_icon = category_icon;
            }

            public Integer getParent_id() {
                return parent_id;
            }

            public void setParent_id(Integer parent_id) {
                this.parent_id = parent_id;
            }

            public Object getData() {
                return data;
            }

            public void setData(Object data) {
                this.data = data;
            }
        }
    }
}
