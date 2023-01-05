package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.RekrutacjaDto;
import pl.hrmanagement.appforhr.entity.Rekrutacja;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RekrutacjaMapper {
    Rekrutacja toEntity(RekrutacjaDto rekrutacjaDto);

    RekrutacjaDto toDto(Rekrutacja rekrutacja);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rekrutacja partialUpdate(RekrutacjaDto rekrutacjaDto, @MappingTarget Rekrutacja rekrutacja);
}