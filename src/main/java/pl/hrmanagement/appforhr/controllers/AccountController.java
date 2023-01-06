package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.hrmanagement.appforhr.entity.Account;
import pl.hrmanagement.appforhr.service.AccountService;




@Controller
@RequiredArgsConstructor
public class AccountController{

    private final AccountService accountService;

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("newAccount",new Account());
        return "register";
    }

    @PostMapping("/add-account")
    public String addAccount(@ModelAttribute Account account){

            accountService.saveAccount(account);
            return "login";

    }


    @GetMapping("/app")
    public String getIndexPage(Model model) {
        return "app";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

}
