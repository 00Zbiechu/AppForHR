package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.hrmanagement.appforhr.dto.OfertaToSaveDTO;
import pl.hrmanagement.appforhr.entity.Stanowisko;
import pl.hrmanagement.appforhr.projections.ListOfOffers;
import pl.hrmanagement.appforhr.repository.StanowiskoRepository;
import pl.hrmanagement.appforhr.service.OfertaService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class OfertaController {

    private final OfertaService ofertaService;

    private final StanowiskoRepository stanowiskoRepository;

    @GetMapping("/getoffers")
    public String getOfferPage(Model model) {

        List<ListOfOffers> listOfOffers = ofertaService.getListOfOffers();
        model.addAttribute("listOfOffers", listOfOffers);
        return "showoffers";

    }


    @GetMapping("/createoffer")
    public String getCreateOfferPage(Model model) {

        model.addAttribute("newOffer", new OfertaToSaveDTO());
        List<Stanowisko> stanowiska = stanowiskoRepository.findAll();
        model.addAttribute("position", stanowiska);
        return "createoffersite";

    }


    @PostMapping("/save-offer")
    public String createOffer(@Valid OfertaToSaveDTO ofertaToSaveDTO, BindingResult result, Model model) {


        if (result.hasErrors()) {

            model.addAttribute("newOffer", new OfertaToSaveDTO());
            List<Stanowisko> stanowisko = stanowiskoRepository.findAll();
            model.addAttribute("position", stanowisko);
            return "createoffersite";

        }

        ofertaService.createOffer(ofertaToSaveDTO);
        return "redirect:/employee";


    }

}
