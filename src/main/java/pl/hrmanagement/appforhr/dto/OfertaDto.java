package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Oferta} entity
 */
@Data
public class OfertaDto implements Serializable {
    private final Integer id;
    private final String tytul;
    private final String opisOferty;
    private final String wymagania;
    private final String lokalizacja;
    private final LocalDate dataWystawieniaOferty;
}