package com.exemplo.somaapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        return ("O resultado da soma é: ") + (num1 + num2);
    }

}
