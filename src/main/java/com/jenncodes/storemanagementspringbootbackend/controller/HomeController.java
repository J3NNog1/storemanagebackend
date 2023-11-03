package com.jenncodes.storemanagementspringbootbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Store Management Spring Boot Backend Application";
    }
    @GetMapping("/secured")
    public String secured() {
        return "Welcome to the secured page";
    }
}
