package com.terio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Terto_MY on 2021-07-04 9:12
 */

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "thymeleaf-terio");
        return "thymeleaf/index";
    }

    @RequestMapping("center")
    public String center() {
        return "Hello Thymeleaf";
    }
}
