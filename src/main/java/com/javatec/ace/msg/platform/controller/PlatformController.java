package com.javatec.ace.msg.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class PlatformController {
    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name") String name){
        return name+"Hello World!";
    }
}
