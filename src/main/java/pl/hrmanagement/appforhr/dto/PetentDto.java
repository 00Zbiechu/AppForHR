package pl.hrmanagement.appforhr.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Petent} entity
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PetentDto implements Serializable {

    private Integer id;
    private String petentImie;
    private String petentNazwisko;
    private LocalDate petentDataUrodzenia;
    private String petentPesel;
    private String petentNrTelefonu;
    private String petentMail;
    private String petentUlica;
    private Integer petentNrDomu;
    private Integer petentNrMieszkania;
    private String petentMiasto;
    private String petentKraj;
    private String petentWojewodztwo;
    private String petentKodPocztowy;
}