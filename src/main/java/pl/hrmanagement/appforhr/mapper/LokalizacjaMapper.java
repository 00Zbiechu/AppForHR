package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.LokalizacjaDto;
import pl.hrmanagement.appforhr.entity.Lokalizacja;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LokalizacjaMapper {
    Lokalizacja toEntity(LokalizacjaDto lokalizacjaDto);

    LokalizacjaDto toDto(Lokalizacja lokalizacja);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Lokalizacja partialUpdate(LokalizacjaDto lokalizacjaDto, @MappingTarget Lokalizacja lokalizacja);
}