package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Привет, мир!";
    }


    @GetMapping("/random")
    public int random() {
        return ThreadLocalRandom.current().nextInt(0, 1000);
    }

}
