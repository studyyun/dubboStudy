package com.dubbo.consumer.controller;

import com.dubbo.demo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-23  11:20
 */
@RestController
public class TestController {
    
    @DubboReference(check = false)
    private HelloService helloService;

    @GetMapping("/hello")
    public void sayHello(String name) {
        System.out.println(new Date());
        helloService.sayHi(name);
    }
    
}
