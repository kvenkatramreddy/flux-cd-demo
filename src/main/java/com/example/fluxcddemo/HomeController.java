package com.example.fluxcddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @GetMapping("/greet")
    public String greet(@RequestParam("greeter") String greeter){
        if(greeter.isBlank()){
            return "Hi Somebody";
        }
        return "Hi "+greeter;
    }
}