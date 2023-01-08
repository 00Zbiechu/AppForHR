package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Kierownik} entity
 */
@Data
public class KierownikDto implements Serializable {
    private final String kierownikImie;
    private final String kierownikNazwisko;
    private final LocalDate kierownikDataUrodzenia;
    private final String kierownikPesel;
    private final String kierownikNrTelefonu;
    private final String kierownikMail;
    private final String kierownikUlica;
    private final Integer kierownikNrDomu;
    private final Integer kierownikNrMieszkania;
    private final String kierownikMiasto;
    private final String kierownikKraj;
    private final String kierownikWojewodztwo;
    private final String kierownikKodPocztowy;
    private final BigDecimal kierownikZarobki;
    private final LocalDate kierownikDataZatrudnienia;
    private final Boolean kierownikStatusZatrudnienia;
    private final String obowiazki;
}