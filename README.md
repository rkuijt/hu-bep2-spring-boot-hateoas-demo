# Spring Boot HATEOAS Demo

## Introduction
This demo project shows the basics of how to implement HATEOAS according to the HAL standard in Spring Boot.  
The demo mocks away the domain and persistence layer. 

## Running this project
To build this project you will at least need Java JDK 11, you can download this from https://adoptopenjdk.net/  

## Calling the API
By default the API will run on `http://localhost:8080/api`  
The demo endpoint is `/student/{id}`  
For example: http://localhost:8080/api/student/1337

## Why U no Lombok
Lombok eases the development process by introducing a lot of great annotations which allows you to write less boilerplate code.  
The downside of Lombok (in this case) is that it hides internal complexity, which is not helpful when learning how to write proper code.

