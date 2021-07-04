package com.terio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Terto_MY on 2021-07-04 9:37
 */

@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {
        int a = 1/0;
        return "thymeleaf/error";
    }
}
