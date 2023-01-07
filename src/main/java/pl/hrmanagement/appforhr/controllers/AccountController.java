package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.service.AccountService;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;


    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("newAccount", new AccountDto());
        return "register";
    }

    @PostMapping("/add-account")
    public String addAccount(@Valid AccountDto accountDto,BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("newAccount", new AccountDto());
            return "register";
        }

            accountService.saveAccount(accountDto);
            return "redirect:/login";


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
