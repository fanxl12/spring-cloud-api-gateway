package com.fanxl.apigateway.exception;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/13 0013 22:48
 */
public class RateLimitException extends RuntimeException {

    public RateLimitException(String msg) {
        super(msg);
    }

}
