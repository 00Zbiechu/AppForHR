package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.PetentDto;
import pl.hrmanagement.appforhr.entity.Oferta;
import pl.hrmanagement.appforhr.entity.Petent;
import pl.hrmanagement.appforhr.entity.Podanie;
import pl.hrmanagement.appforhr.mapper.PetentMapper;
import pl.hrmanagement.appforhr.repository.OfertaRepository;
import pl.hrmanagement.appforhr.repository.PetentRepository;
import pl.hrmanagement.appforhr.repository.PodanieRepository;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PodanieService {

    private final PodanieRepository podanieRepository;
    private final PetentRepository petentRepository;
    private final OfertaRepository ofertaRepository;
    private final PetentMapper petentMapper;


    public void savePodanie(Integer offerId, PetentDto petentDto) {

        Oferta oferta = ofertaRepository.getOfertaById(offerId);

        petentDto.setPetentDataUrodzenia(LocalDate.now());

        Petent petent = petentMapper.toEntity(petentDto);

        petentRepository.save(petent);

        Podanie podanie = Podanie.builder()
                .idOferta(oferta)
                .idPetent(petent)
                .kwalifikacje("")
                .cv("Tytył")
                .dataZlozeniaPodania(LocalDate.now())
                .build();

        podanieRepository.save(podanie);

    }

}
