package pl.hrmanagement.appforhr.dto;

import lombok.*;
import pl.hrmanagement.appforhr.entity.Stanowisko;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OfertaToSaveDTO {

    private Stanowisko stanowisko;

    private String tytul;

    private String opisOferty;

    private String wymagania;

    private String lokalizacja;

    private LocalDate dataWystawieniaOferty;

}
