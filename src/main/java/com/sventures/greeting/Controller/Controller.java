package com.sventures.greeting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String sayHello(){
        return "Hello ,namasthe";
    }
}
