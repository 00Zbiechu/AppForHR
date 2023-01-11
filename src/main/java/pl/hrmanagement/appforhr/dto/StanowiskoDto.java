package pl.hrmanagement.appforhr.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Stanowisko} entity
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StanowiskoDto implements Serializable {
    private Integer id;
    private String nazwaStanowiska;
    private String opisStanowiska;
    private BigDecimal minimalneZarobki;
    private BigDecimal maksymalneZarobki;
}