package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.service.HeadhunterService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/headhunter")
public class HeadhunterController {

    private final HeadhunterService headhunterService;

    @GetMapping
    public String getHeadhunterPage(Model model){

        //What user see after change view
        model.addAttribute("table",headhunterService.getListOfActiveHeadhunters());
        model.addAttribute("marks", "Headhunter");

        //Set user login before send to another view
        model.addAttribute("loggedUser",LoginController.getLoginDto());
        return "app";

    }


}
