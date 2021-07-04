package com.terio.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Terto_MY on 2021-07-04 9:36
 */
//@ControllerAdvice
public class ExceptionHandler {

    public static final String ERROR_VIEW = "error";

//    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {

        e.printStackTrace();
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.addObject("url", request.getRequestURI());
        mv.setViewName(ERROR_VIEW);
        return mv;
    }
}
