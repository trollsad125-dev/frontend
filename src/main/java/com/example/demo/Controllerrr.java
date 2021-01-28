package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nizis on 1/27/2021.
 */
public class Controllerrr {
    @GetMapping("/")
    public String viewHome(){
        return "index";
    }
}
