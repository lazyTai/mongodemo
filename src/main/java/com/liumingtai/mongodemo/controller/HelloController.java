package com.liumingtai.mongodemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    @RequestMapping("/hello-world")
    String HelloWorld() {
        return "hello1";
    }
}
