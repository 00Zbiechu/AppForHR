package pl.hrmanagement.appforhr.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.repository.OfertaRepository;
import pl.hrmanagement.appforhr.service.OfertaService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/createoffer")
public class OfertaController {

    private final OfertaService ofertaService;

    @GetMapping
    public String getCreateOfferPage(Model model){


        model.addAttribute("offerdata",new OfertaDto());
        return "createoffer";

    }

    @PostMapping("createoffer")
    public String createOffer(@ModelAttribute OfertaDto ofertaDto){

        ofertaService.createOffer(ofertaDto);
        return "app";

    }

}
