package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.dto.OfertaToSaveDTO;
import pl.hrmanagement.appforhr.dto.StanowiskoDto;
import pl.hrmanagement.appforhr.entity.Oferta;
import pl.hrmanagement.appforhr.entity.Stanowisko;
import pl.hrmanagement.appforhr.mapper.OfertaMapper;
import pl.hrmanagement.appforhr.mapper.OfertaToSaveMapper;
import pl.hrmanagement.appforhr.repository.OfertaRepository;
import pl.hrmanagement.appforhr.repository.StanowiskoRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfertaService {

    private final OfertaRepository ofertaRepository;

    private final OfertaToSaveMapper ofertaToSaveMapper;

    private final StanowiskoRepository stanowiskoRepository;


    public void createOffer(OfertaDto ofertaDto){

        Stanowisko stanowisko = stanowiskoRepository.findStanowiskoById(ofertaDto.getIdStanowisko());
        System.out.println(stanowisko);

        OfertaToSaveDTO ofertaToSaveDTO = new OfertaToSaveDTO();
        ofertaToSaveDTO.setStanowisko(stanowisko);
        ofertaToSaveDTO.setTytul(ofertaDto.getTytul());
        ofertaToSaveDTO.setWymagania(ofertaDto.getWymagania());
        ofertaToSaveDTO.setOpisOferty(ofertaDto.getOpisOferty());
        ofertaToSaveDTO.setDataWystawieniaOferty(LocalDate.now());

        Oferta oferta = ofertaToSaveMapper.toEntity(ofertaToSaveDTO);
        ofertaRepository.save(oferta);

    }

}
