package com.baofu.cloud.javatest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {

    @RequestMapping("/")
    public String helloworld() {
        System.out.println("hello world!");
        return "github hello world!1112";
    }

}
