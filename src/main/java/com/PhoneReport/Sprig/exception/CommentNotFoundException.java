package com.PhoneReport.Sprig.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CommentNotFoundException extends RuntimeException {

    public CommentNotFoundException(String msg) {
        super(msg);
    }

    public CommentNotFoundException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}
