package com.terio.controller;

import com.terio.pojo.JSONResult;
import com.terio.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Terto_MY on 2021-07-01 15:59
 */
@Controller
@RequestMapping("/user")
// RestController <=> Controller + ResponseBody
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){

        User u = new User();
        u.setName("Jotaro");
        u.setPassword("DIO");
        u.setAge(21);
        u.setBirthday(new Date());
        u.setDesc("Hello~");
        return u;
    }

    @RequestMapping("/getUserJson")
    @ResponseBody
    public Object getUserJson(){

        User u = new User();
        u.setName("JOJO");
        u.setPassword("DIO");
        u.setAge(21);
        u.setBirthday(new Date());
        u.setDesc(null);

        return JSONResult.ok(u);
    }
}