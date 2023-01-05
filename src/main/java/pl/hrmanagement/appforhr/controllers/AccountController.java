package pl.hrmanagement.appforhr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "index";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @GetMapping("/app")
    public String getIndexPage() {
        return "app";
    }

}
