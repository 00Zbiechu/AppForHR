package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.hrmanagement.appforhr.dto.PetentDto;
import pl.hrmanagement.appforhr.service.PodanieService;

@Controller
@RequiredArgsConstructor
public class PodanieController {

    private final PodanieService podanieService;

    @PostMapping("/add-application")
    public String addApplication(@ModelAttribute PetentDto petentDto) {

        podanieService.savePodanie(PetentController.getOfferId(), petentDto);
        return "redirect:/getoffers";

    }


}
