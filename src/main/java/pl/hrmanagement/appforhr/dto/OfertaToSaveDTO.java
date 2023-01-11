package pl.hrmanagement.appforhr.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OfertaToSaveDTO {

    private Integer idStanowisko;

    private String tytul;

    private String opisOferty;

    private String wymagania;

    private String lokalizacja;


}
