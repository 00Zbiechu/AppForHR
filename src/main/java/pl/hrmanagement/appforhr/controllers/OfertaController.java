package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.dto.StanowiskoDto;
import pl.hrmanagement.appforhr.entity.Stanowisko;
import pl.hrmanagement.appforhr.mapper.StanowiskoMapper;
import pl.hrmanagement.appforhr.repository.StanowiskoRepository;
import pl.hrmanagement.appforhr.service.OfertaService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class OfertaController {

    private final OfertaService ofertaService;

    private final StanowiskoRepository stanowiskoRepository;

    private final StanowiskoMapper stanowiskoMapper;

    @GetMapping("/createoffer")
    public String getCreateOfferPage(Model model){

        model.addAttribute("newOffer",new OfertaDto());

        List<Stanowisko> stanowisko = stanowiskoRepository.findAll();

        model.addAttribute("position",stanowisko);

        return "createoffersite";

    }


    @PostMapping("/save-offer")
    public String createOffer(@Valid OfertaDto ofertaDto, BindingResult result, Model model){


        if (result.hasErrors()) {

            model.addAttribute("newOffer",new OfertaDto());
            List<Stanowisko> stanowisko = stanowiskoRepository.findAll();
            model.addAttribute("position",stanowisko);
            return "createoffersite";

        }

        ofertaService.createOffer(ofertaDto);
        return "redirect:/employee";


    }

}
