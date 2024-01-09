package com.example.backstagedemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping("/")
    public ResponseEntity<String> getTaxPerDay() {
        return ResponseEntity.ok("Hello World!");
    }
}
