package com.coldwind.easyojbackendquestionservice;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.coldwind.easyojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.coldwind")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.coldwind.easyojbackendserviceclient.service")
public class EasyOjBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyOjBackendQuestionServiceApplication.class, args);
    }

}
