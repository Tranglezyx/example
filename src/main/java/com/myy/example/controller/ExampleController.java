package com.myy.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExampleController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "templates/hello.html";
    }
}
