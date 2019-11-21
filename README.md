# Spring Cloud Netflix demos

## Eureka-Server
Eureka register server:
- http://localhost:8111 
- http://localhost:8112

## Eureka-Client

Eureka client service with user-service
- http://localhost:9001/v1.0/users
- http://localhost:9002/v1.0/users

## Zuul-apigateway

Zuul apigateway as server side loadbalancer and reverse-proxy server

API mappings /api/** --> /user-service/**

- http://localhost:7000/api/v1.0/users
 
 
