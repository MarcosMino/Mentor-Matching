package com.example.mentormatching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// just for test
@Controller
public class testing {


    @GetMapping("/")
    public String test(){
        return "test";
    }
}
