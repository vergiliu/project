package io.github.vergiliu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    // all handlers are called Controllers in Spring Boot
    private final String greeting = "Hello there %s";
    private final AtomicLong connectionId = new AtomicLong(0);
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "stranger") String name) {
        
        return new Greeting(connectionId.incrementAndGet(), String.format(greeting, name));
        
    }
}
