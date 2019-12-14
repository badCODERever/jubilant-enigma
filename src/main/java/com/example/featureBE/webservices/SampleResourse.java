package com.example.featureBE.webservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResourse {

    @RequestMapping(value = "/")
    public String displayValue() {
        return "<h2>Welcome SpringBoot</h2>";
    }

}
