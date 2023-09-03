package com.spellsaif.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    @GetMapping("/")
    public String getUsers() {
        return "These are GET Users Route";
    }
}
