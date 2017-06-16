package com.ren.tarena.xiaohua.entity;

import java.util.List;

/**
 * Created by Renshaobo on 2017/6/11.
 */

public class Tuijian {
    private int error_code;
    private String reason;
    private Result result;

    public static class Result{
        private List<Data> data;

        public static class Data{
            private String content;
            private String hashId;
            private double unixtime;
            private String  updatetime;

            public Data() {
            }

            public Data(String content, String hashId, double unixtime, String updatetime) {
                this.content = content;
                this.hashId = hashId;
                this.unixtime = unixtime;
                this.updatetime = updatetime;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public double getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(double unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "content='" + content + '\'' +
                        ", hashId='" + hashId + '\'' +
                        ", unixtime=" + unixtime +
                        ", updatetime='" + updatetime + '\'' +
                        '}';
            }
        }

        public Result() {
        }

        public Result(List<Data> data) {
            this.data = data;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    '}';
        }
    }

    public Tuijian() {
    }

    public Tuijian(int error_code, String reason, Result result) {
        this.error_code = error_code;
        this.reason = reason;
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Tuijian{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
