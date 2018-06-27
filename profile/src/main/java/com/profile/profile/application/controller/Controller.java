package com.profile.profile.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

    @RequestMapping("/welcome-message")
    public String getController() {
        return "Hello Banele, Everything is fine so far!!";
    }
}
