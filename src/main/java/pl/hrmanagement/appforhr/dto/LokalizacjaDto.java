package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Lokalizacja} entity
 */
@Data
public class LokalizacjaDto implements Serializable {
    private final Integer id;
    private final String ulica;
    private final String kodPocztowy;
    private final String miasto;
    private final String wojewodztwo;
}