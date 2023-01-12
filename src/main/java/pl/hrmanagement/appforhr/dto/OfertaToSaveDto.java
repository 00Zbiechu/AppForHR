package pl.hrmanagement.appforhr.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OfertaToSaveDto {

    private Integer idStanowisko;

    private String tytul;

    private String opisOferty;

    private String wymagania;

    private String lokalizacja;


}
