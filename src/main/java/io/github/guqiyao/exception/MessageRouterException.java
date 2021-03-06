package io.github.guqiyao.exception;

/**
 * @author qiyao.gu@qq.com.
 */
public class MessageRouterException extends RuntimeException {

    public MessageRouterException(String message) {
        super(message);
    }

    public MessageRouterException(String message, Throwable throwable) {
        super(message, throwable);
    }
}