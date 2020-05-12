package com.baofu.cloud.javatest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class BaseController {

    @RequestMapping("/")
    public String home() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        String current = "当前时间" + sdf.format(date);
        log.info(current);
        return current;
    }

}
