package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Dzial} entity
 */
@Data
public class DzialDto implements Serializable {
    private final Integer id;
    private final String nazwaDzialu;
    private final String opisDzialu;
    private final Integer liczbaWolnychStanowisk;
}