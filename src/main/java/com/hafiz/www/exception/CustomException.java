package com.hafiz.www.exception;

/**
 * Created by Thinkpad on 2016/9/14.
 */
public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
