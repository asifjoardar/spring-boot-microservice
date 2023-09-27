package com.asif.tomservice.tom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomController {
    @Autowired
    Environment environment;
    @GetMapping("/")
    public String message() {
        return "Tom say Hello from " + environment.getProperty("local.server.port");
    }
}
