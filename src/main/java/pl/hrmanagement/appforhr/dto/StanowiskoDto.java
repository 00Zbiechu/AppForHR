package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Stanowisko} entity
 */
@Data
public class StanowiskoDto implements Serializable {
    private final Integer id;
    private final String nazwaStanowiska;
    private final String opisStanowiska;
    private final BigDecimal minimalneZarobki;
    private final BigDecimal maksymalneZarobki;
}