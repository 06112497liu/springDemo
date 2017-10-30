package com.bbd.exception;

public class ApplicationException extends RuntimeException {

    private Integer code;
    private String msg;

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

    public ApplicationException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public ApplicationException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
