package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProviderController {

    @Value("${spring.application.name}")
    public String name;

    @Value("${text}")
    public String text;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello,"+name;
    }

    @GetMapping("/name")
    public String name(){
        return name+"===="+text;
    }
}
