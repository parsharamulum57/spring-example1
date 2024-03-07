package com.ndevs.fridge.controller;

import com.ndevs.fridge.dto.FridgeItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Hello {

    @RequestMapping("/")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("hello");
    }
}
