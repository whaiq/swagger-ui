package com.example.swagger.demo.catalog2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {


    @GetMapping("/re")
    public String request(){
        return "demo1request";
    }
}
