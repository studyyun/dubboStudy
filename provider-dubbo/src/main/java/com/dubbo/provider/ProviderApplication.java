package com.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-23  11:07
 */
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {


    public static void main(String[] args)
    {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
