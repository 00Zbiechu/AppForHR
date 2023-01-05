package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.HistoriaPracy} entity
 */
@Data
public class HistoriaPracyDto implements Serializable {
    private final Integer id;
    private final LocalDate rozpoczeciePracy;
    private final LocalDate zakonczeniePracy;
}