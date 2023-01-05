package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Pracownik} entity
 */
@Data
public class PracownikDto implements Serializable {
    private final Integer id;
    private final String pracownikImie;
    private final String pracownikNazwisko;
    private final LocalDate pracownikDataUrodzenia;
    private final String pracownikPesel;
    private final String pracownikNrTelefonu;
    private final String pracownikMail;
    private final String pracownikUlica;
    private final Integer pracownikNrDomu;
    private final Integer pracownikNrMieszkania;
    private final String pracownikMiasto;
    private final String pracownikKraj;
    private final String pracownikWojewodztwo;
    private final String pracownikKodPocztowy;
    private final BigDecimal pracownikZarobki;
    private final Boolean pracownikStatusZatrudnienia;
}