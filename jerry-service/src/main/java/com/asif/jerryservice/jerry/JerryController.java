package com.asif.jerryservice.jerry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JerryController {
    @Autowired
    Environment environment;
    @GetMapping("/")
    public String message() {
        return "Jerry say Hello from " + environment.getProperty("local.server.port");
    }
}
