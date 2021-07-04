package com.terio.exception;

import com.terio.pojo.JSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Terto_MY on 2021-07-04 9:46
 */
@RestControllerAdvice
public class AjaxExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public JSONResult defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        e.printStackTrace();
        return JSONResult.errorException(e.getMessage());
    }
}
