package com.profile.profile.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/controller")
public class Controller {

    @RequestMapping("/welcome-message")
    //@RequestMapping("/")
    public String getController() {
        return "Hello Banele, Everything is fine so far!!";
    }
}