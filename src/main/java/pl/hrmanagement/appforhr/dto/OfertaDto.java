package pl.hrmanagement.appforhr.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Oferta} entity
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfertaDto implements Serializable {
    private  Integer id;
    private  String tytul;
    private  String opisOferty;
    private  String wymagania;
    private  String lokalizacja;
    private  LocalDate dataWystawieniaOferty;
}