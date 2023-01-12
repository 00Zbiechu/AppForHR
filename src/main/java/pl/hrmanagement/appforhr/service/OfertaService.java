package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.dto.OfertaToSaveDto;
import pl.hrmanagement.appforhr.entity.Oferta;
import pl.hrmanagement.appforhr.entity.Stanowisko;
import pl.hrmanagement.appforhr.mapper.OfertaMapper;
import pl.hrmanagement.appforhr.projections.ListOfOffers;
import pl.hrmanagement.appforhr.repository.OfertaRepository;
import pl.hrmanagement.appforhr.repository.StanowiskoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OfertaService {

    private final OfertaRepository ofertaRepository;

    private final OfertaMapper ofertaMapper;

    private final StanowiskoRepository stanowiskoRepository;

    public List<ListOfOffers> getListOfOffers() {

        return ofertaRepository.getListOfOffers();

    }


    public void createOffer(OfertaToSaveDto ofertaToSaveDTO) {


        //Pobranie stanowiska na podstawie id z obiektu OfertaToSaveDto
        Stanowisko stanowisko = stanowiskoRepository.findStanowiskoById(ofertaToSaveDTO.getIdStanowisko());

        //Ustawienie nowych właściwosći na nowym obiekcie OfertaDTO
        OfertaDto ofertaDto = OfertaDto.builder()
                .idStanowisko(stanowisko)
                .tytul(ofertaToSaveDTO.getTytul())
                .opisOferty(ofertaToSaveDTO.getOpisOferty())
                .wymagania(ofertaToSaveDTO.getWymagania())
                .lokalizacja(ofertaToSaveDTO.getLokalizacja())
                .dataWystawieniaOferty(LocalDate.now())
                .build();

        //Przemapowanie
        Oferta oferta = ofertaMapper.toEntity(ofertaDto);

        ofertaRepository.save(oferta);


    }

}
