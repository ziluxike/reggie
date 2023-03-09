package com.ziluxike.reggie.common;

/**
 * Author: ziluxike
 * Time: 2023/1/4 21:48
 * <p>
 * 自定义异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
