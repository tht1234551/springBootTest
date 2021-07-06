package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/hello")
    public String test(Model model){
        model.addAttribute("data", "hello");
        return "/hello";
    }

    @GetMapping("/hello1")
    @ResponseBody
    public Object test1(Model model){
        HashMap<String, Object> map = new HashMap<>();
        map.put("test","test1");
        map.put("test123","test1aaa");
        return map;
    }


}
