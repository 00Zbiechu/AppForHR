package pl.hrmanagement.appforhr.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hrmanagement.appforhr.projections.ListActiveEmployee;
import pl.hrmanagement.appforhr.service.PracownikService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employee")
public class PracownikController {

    private final PracownikService pracownikService;

    @GetMapping
    public String getEmployeePage(Model model){

        //What user see after change view
        model.addAttribute("table",pracownikService.getListOfActiveEmployee());
        model.addAttribute("marks", "Employee");

        //Set user login before send to another view
        model.addAttribute("loggedUser",LoginController.getLoginDto());
        return "app";

    }


}
