package com.terio.controller;

import com.terio.pojo.JSONResult;
import com.terio.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Terto_MY on 2021-07-01 15:17
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot";
    }

    @RequestMapping("/getResource")
    public JSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return JSONResult.ok(bean);
    }
}
