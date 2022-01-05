package com.dubbo.provider.service.impl;

import com.dubbo.demo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.TimeUnit;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-23  11:19
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHi(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello " + name);
    }
}
