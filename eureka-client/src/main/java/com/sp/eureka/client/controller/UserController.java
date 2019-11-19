package com.sp.eureka.client.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1.0")
public class UserController {

    private final DiscoveryClient discoveryClient;

    public UserController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping(value = "/users", produces = {"application/json"})
    public ResponseEntity<String> users() {
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        instances.forEach(serviceInstance -> System.out.println(serviceInstance.getUri().toString()));


        return new ResponseEntity<>(instances.get(0).getInstanceId(), HttpStatus.OK);
    }
}
