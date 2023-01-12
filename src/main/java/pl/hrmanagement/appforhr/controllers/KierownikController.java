package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.service.KierownikService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/manager")
public class KierownikController {

    private final KierownikService kierownikService;

    @GetMapping
    public String getManagerPage(Model model){

        //What user see after change view
        model.addAttribute("table",kierownikService.getListOfActiveManagers());
        model.addAttribute("marks", "Manager");

        //Set user login before send to another view
        model.addAttribute("loggedUser",LoginController.getLoginDto());
        return "app";

    }

}
