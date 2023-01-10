package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.entity.Oferta;
import pl.hrmanagement.appforhr.mapper.OfertaMapper;
import pl.hrmanagement.appforhr.repository.OfertaRepository;

@Service
@RequiredArgsConstructor
public class OfertaService {

    private final OfertaRepository ofertaRepository;

    private final OfertaMapper ofertaMapper;


    public void createOffer(OfertaDto ofertaDto){

        Oferta oferta = ofertaMapper.toEntity(ofertaDto);

        ofertaRepository.save(oferta);

    }

}
