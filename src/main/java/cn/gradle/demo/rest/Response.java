package cn.gradle.demo.rest;

/**
 * Created by dell on 2017/7/28.
 */
public class Response {

    private static final String OK = "ok";
    private static final String ERROR = "error";


    private Meta meta;
    private Object data;

    public Response success() {
        this.meta = new Meta(1,true, OK);
        return this;
    }

    public Response success(Object data) {
        this.meta = new Meta(1,true, OK);
        this.data = data;
        return this;
    }

    public Response failure() {
        this.meta = new Meta(0,false, ERROR);
        return this;
    }

    public Response failure(String message) {
        this.meta = new Meta(0,false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    public class Meta {
        private int result;
        private boolean success;
        private String message;

        public Meta(int result,boolean success) {
            this.result = result;
            this.success = success;
        }

        public Meta(int result,boolean success, String message) {
            this.result = result;
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }

        public boolean getSuccess(){ return success;}

        public int getResult() {
            return result;
        }
    }
}
