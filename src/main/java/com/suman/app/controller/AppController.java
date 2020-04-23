package com.suman.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @RequestMapping(path="/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return "Hello "+name;
    }
}
