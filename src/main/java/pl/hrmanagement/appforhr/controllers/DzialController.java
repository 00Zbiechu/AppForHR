package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.service.DzialService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/department")
public class DzialController {

    private final DzialService dzialService;

    @GetMapping
    public String getDepartmentPage(Model model) {

        //What user see after change view
        model.addAttribute("table", dzialService.getListOfDepartments());
        model.addAttribute("marks", "Department");

        //Set user login before send to another view
        model.addAttribute("loggedUser", LoginController.getLoginDto());
        return "depapp";

    }


}
