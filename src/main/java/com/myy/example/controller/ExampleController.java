package com.myy.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ExampleController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "templates/hello.html";
    }

    @RequestMapping("/view")
    public String view(Map<String, Object> paramMap) {
        paramMap.put("name", "zhangSan");
        paramMap.put("age", 28);
        return "hello";
    }
}
