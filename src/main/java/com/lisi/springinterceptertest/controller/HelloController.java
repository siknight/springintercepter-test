package com.lisi.springinterceptertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/tohello.do")
    public String tohello(){
        return "hello lisi";
    }
}
