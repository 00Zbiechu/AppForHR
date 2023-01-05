package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Petent} entity
 */
@Data
public class PetentDto implements Serializable {
    private final Integer id;
    private final String petentImie;
    private final String petentNazwisko;
    private final LocalDate petentDataUrodzenia;
    private final String petentPesel;
    private final String petentNrTelefonu;
    private final String petentMail;
    private final String petentUlica;
    private final Integer petentNrDomu;
    private final Integer petentNrMieszkania;
    private final String petentMiasto;
    private final String petentKraj;
    private final String petentWojewodztwo;
    private final String petentKodPocztowy;
}