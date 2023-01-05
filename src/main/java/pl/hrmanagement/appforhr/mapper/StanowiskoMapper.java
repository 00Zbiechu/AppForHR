package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.StanowiskoDto;
import pl.hrmanagement.appforhr.entity.Stanowisko;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StanowiskoMapper {
    Stanowisko toEntity(StanowiskoDto stanowiskoDto);

    StanowiskoDto toDto(Stanowisko stanowisko);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Stanowisko partialUpdate(StanowiskoDto stanowiskoDto, @MappingTarget Stanowisko stanowisko);
}