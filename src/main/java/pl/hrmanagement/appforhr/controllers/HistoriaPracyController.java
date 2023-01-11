package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.service.HistoriaPracyService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/story")
public class HistoriaPracyController {

    private final HistoriaPracyService historiaPracyService;

    @GetMapping
    public String getDepartmentPage(Model model) {

        //What user see after change view
        model.addAttribute("table", historiaPracyService.whenEmployeeStartAndEndJob());
        model.addAttribute("marks", "Story");

        //Set user login before send to another view
        model.addAttribute("loggedUser", LoginController.getLoginDto());
        return "stoapp";

    }


}
