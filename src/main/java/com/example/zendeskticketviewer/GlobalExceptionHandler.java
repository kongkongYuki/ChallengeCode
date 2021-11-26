package com.example.zendeskticketviewer;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpServerErrorException.class)
    public String doHandleHttpServerErrorException(HttpServerErrorException e) {
        e.printStackTrace();
        return "HttpServerErrorException:" + e.getMessage();
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public String doHandleHttpClientErrorException(HttpClientErrorException e) {
        e.printStackTrace();
        return "HttpClientErrorException:" + e.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    public String doHandleRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return "RuntimeException:" + e.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public String doHandleException(Exception e) {
        e.printStackTrace();
        return "Exception:" + e.getMessage();
    }
}