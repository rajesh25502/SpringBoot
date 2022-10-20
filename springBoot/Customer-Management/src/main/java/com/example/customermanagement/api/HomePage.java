package com.example.customermanagement.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomePage {
    @GetMapping
    public String home()
    {
        return "You are in Home Page.! "+ new Date();
    }
}
