package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Rekrutacja} entity
 */
@Data
public class RekrutacjaDto implements Serializable {
    private final Integer id;
    private final LocalDate dataRozmowyKwalifikacyjnej;
}