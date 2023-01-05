package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Headhunter} entity
 */
@Data
public class HeadhunterDto implements Serializable {
    private final Integer id;
    private final String headhunterImie;
    private final String headhunterNazwisko;
    private final LocalDate headhunterDataUrodzenia;
    private final String headhunterPesel;
    private final String headhunterNrTelefonu;
    private final String headhunterMail;
    private final String headhunterUlica;
    private final Integer headhunterNrDomu;
    private final Integer headhunterNrMieszkania;
    private final String headhunterMiasto;
    private final String headhinterKraj;
    private final String headhunterWojewodztwo;
    private final String headhunterKodPocztowy;
    private final BigDecimal headhunterZarobki;
    private final LocalDate headhunterDataZatrudnienia;
    private final Boolean headhunterStatusZatrudnienia;
}