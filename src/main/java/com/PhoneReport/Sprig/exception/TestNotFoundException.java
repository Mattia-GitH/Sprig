package com.PhoneReport.Sprig.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TestNotFoundException extends RuntimeException {
    public TestNotFoundException(String msg) {
        super(msg);
    }

    public TestNotFoundException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
