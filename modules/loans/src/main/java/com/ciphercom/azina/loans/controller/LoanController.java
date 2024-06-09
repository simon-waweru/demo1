package com.ciphercom.azina.loans.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/loans")
public class LoanController {
    @GetMapping("/hello")
    private String getHello() {
        return "Hello from Loans";
    }
}