package com.example.featureBE.webservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResourse {

    @RequestMapping(value = "/displayText")
    public String displayValue() {
        return "Welcome SpringBoot";
    }

}
