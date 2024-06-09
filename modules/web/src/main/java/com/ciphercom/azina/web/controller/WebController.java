package com.ciphercom.azina.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WebController {

    @GetMapping("/hello")
    public String getMain(){
        return "Hello main web";
    }
}
