package com.sp.zuul.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulServer
@EnableZuulProxy
@ComponentScan(value = "com.sp")
public class ZuulApigatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApigatewayApplication.class, args);
    }
}
