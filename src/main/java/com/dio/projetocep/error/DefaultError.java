package com.dio.projetocep.error;

public class DefaultError {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DefaultError(int value, String message) {
        this.code = value;
        this.message = message;
    }
}
