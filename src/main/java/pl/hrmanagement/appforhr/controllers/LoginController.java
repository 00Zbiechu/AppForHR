package pl.hrmanagement.appforhr.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.hrmanagement.appforhr.dto.LoginDto;
import pl.hrmanagement.appforhr.service.LoginService;
import pl.hrmanagement.appforhr.service.PracownikService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @Setter
    @Getter
    public static LoginDto loginDto;
    private final LoginService loginService;
    private final PracownikService pracownikService;

    //Login in
    @GetMapping
    public String getLoginPage(Model model) {

        model.addAttribute("loginData", new LoginDto());
        return "login";

    }

    @PostMapping("/login-in")
    public String loginIn(@Valid LoginDto loginDto, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "redirect:/";
        }


        //Mail lowercase
        loginDto.setEmail(loginDto.getEmail().toLowerCase());
        if (!loginService.loginIntoAccount(loginDto)) {

            return "redirect:/";

        } else {

            //What user see after change view
            model.addAttribute("table", pracownikService.getListOfActiveEmployee());
            model.addAttribute("marks", "Employee");

            //Set user login before send to another view
            LoginController.setLoginDto(loginDto);
            model.addAttribute("loggedUser", loginDto);
            return "app";

        }


    }

}
