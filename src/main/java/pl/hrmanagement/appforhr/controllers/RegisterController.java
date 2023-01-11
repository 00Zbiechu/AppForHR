package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.service.RegisterService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    //Register new Account
    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("newAccount", new AccountDto());
        return "register";
    }

    @PostMapping("/add-account")
    public String addAccount(@Valid AccountDto accountDto, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("newAccount", new AccountDto());
            return "register";
        }

        if (registerService.saveAccount(accountDto)) {

            return "redirect:/";

        } else {

            return "redirect:/register";

        }


    }

}
