package com.coldwind.easyojbackenduserservice;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

// todo 如需开启 Redis，须移除 exclude 中的内容
// (exclude = {RedisAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.coldwind.easyojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.coldwind")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.coldwind.easyojbackendserviceclient.service")
public class EasyOjBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyOjBackendUserServiceApplication.class, args);
    }

}
