package com.start.web.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }
}
