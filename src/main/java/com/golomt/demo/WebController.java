package com.golomt.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WebController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index";
    }
    @RequestMapping("/web")
    public String demo(Map<String, Object> model){
        return  "web";
    }
}
