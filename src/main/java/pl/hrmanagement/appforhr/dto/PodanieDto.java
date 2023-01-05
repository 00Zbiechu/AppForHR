package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Podanie} entity
 */
@Data
public class PodanieDto implements Serializable {
    private final Integer id;
    private final String kwalifikacje;
    private final String cv;
    private final LocalDate dataZlozeniaPodania;
}