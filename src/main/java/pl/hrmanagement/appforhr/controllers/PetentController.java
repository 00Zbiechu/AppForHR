package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.service.PetentService;
import pl.hrmanagement.appforhr.service.PracownikService;

@Controller
@RequestMapping("/application")
@RequiredArgsConstructor
public class PetentController {

    private final PetentService petentService;

    @GetMapping
    public String getApplicationPage(Model model){

        //What user see after change view
        model.addAttribute("table",petentService.getApplicationForEachPosition());
        model.addAttribute("marks", "Application for JOB");

        //Set user login before send to another view
        model.addAttribute("loggedUser",LoginController.getLoginDto());
        return "aplapp";

    }

}
