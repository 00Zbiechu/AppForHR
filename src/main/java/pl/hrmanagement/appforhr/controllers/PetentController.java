package pl.hrmanagement.appforhr.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.hrmanagement.appforhr.dto.PetentDto;
import pl.hrmanagement.appforhr.service.PetentService;

@Controller
@RequiredArgsConstructor
public class PetentController {

    @Setter
    @Getter
    public static int offerId;
    private final PetentService petentService;

    @GetMapping("/application")
    public String getApplicationPage(Model model) {

        //What user see after change view
        model.addAttribute("table", petentService.getApplicationForEachPosition());
        model.addAttribute("marks", "Application for JOB");

        //Set user login before send to another view
        model.addAttribute("loggedUser", LoginController.getLoginDto());
        return "aplapp";

    }

    @GetMapping("/sendcv/{id}")
    public String getApplicationPage(@PathVariable("id") Integer id, Model model) {


        model.addAttribute("applyData", new PetentDto());
        setOfferId(id);
        return "applyforjob";

    }

}
