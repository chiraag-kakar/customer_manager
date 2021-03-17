package com.dineshkrish.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping
    public String home() {
        return "Hey Congratulations, You made it!!! "+new Date()+ "| Hope you will have a great experience using this API created using SpringBoot --- Chiraag Kakar :)";
    }
}
