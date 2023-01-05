package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Kraj} entity
 */
@Data
public class KrajDto implements Serializable {
    private final Integer id;
    private final String krajNazwa;
}