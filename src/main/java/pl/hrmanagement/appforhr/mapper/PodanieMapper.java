package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.PodanieDto;
import pl.hrmanagement.appforhr.entity.Podanie;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PodanieMapper {
    Podanie toEntity(PodanieDto podanieDto);

    PodanieDto toDto(Podanie podanie);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Podanie partialUpdate(PodanieDto podanieDto, @MappingTarget Podanie podanie);
}