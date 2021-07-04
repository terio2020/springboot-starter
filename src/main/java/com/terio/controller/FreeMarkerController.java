package com.terio.controller;

import com.terio.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Terto_MY on 2021-07-03 19:48
 */

@Controller
@RequestMapping("/ftl")
public class FreeMarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "freemarker/center/center";
    }
}
