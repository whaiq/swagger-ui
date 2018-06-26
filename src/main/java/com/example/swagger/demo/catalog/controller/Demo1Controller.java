package com.example.swagger.demo.catalog.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(description = "demo")
public class Demo1Controller
{

    @GetMapping("/re")
    public String request(){
        return "demo1request";
    }

}
