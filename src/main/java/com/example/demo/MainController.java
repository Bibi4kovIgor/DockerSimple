package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(path="/")
public class MainController {

    @RestController
    class GreetingController {

        @RequestMapping("/hello/{name}")
        String hello(@PathVariable String name) {
            return "Hello, " + name + "!";
        }

        @GetMapping("/")
        public String index() {
            return "Hello, World!";
        }

    }
}
