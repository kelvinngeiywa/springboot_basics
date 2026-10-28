package com.kelvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBasicsApplication.class, args);
    }

    @GetMapping
    public String HelloWorld(){
        return "Hello world!!";
    }

}
