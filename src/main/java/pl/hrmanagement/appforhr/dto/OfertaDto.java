package pl.hrmanagement.appforhr.dto;

import lombok.*;
import pl.hrmanagement.appforhr.entity.Stanowisko;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Oferta} entity
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OfertaDto implements Serializable {

    private Stanowisko idStanowisko;
    @NotBlank
    @Size(min = 0,max = 30, message = "Too long")
    private String tytul;
    @NotBlank
    @Size(min = 0,max = 100, message = "Too long")
    private String opisOferty;
    @NotBlank
    @Size(min = 0,max = 100, message = "Too long")
    private String wymagania;
    @NotBlank
    @Size(min = 0,max = 20, message = "Too long")
    private String lokalizacja;

    private LocalDate dataWystawieniaOferty;
}