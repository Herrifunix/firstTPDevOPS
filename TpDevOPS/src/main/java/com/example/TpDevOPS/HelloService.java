package com.example.TpDevOPS;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloService{
    @GetMapping("/")
    public String hello(){
        return "Bonsoir";
    }
}
//why