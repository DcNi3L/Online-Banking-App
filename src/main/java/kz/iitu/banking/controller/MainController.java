package kz.iitu.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "index.html";
    }

    @GetMapping("/signin")
    public String signin() {
        return "signin.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup.html";
    }
}
