package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.HistoriaPracyDto;
import pl.hrmanagement.appforhr.entity.HistoriaPracy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HistoriaPracyMapper {
    HistoriaPracy toEntity(HistoriaPracyDto historiaPracyDto);

    HistoriaPracyDto toDto(HistoriaPracy historiaPracy);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HistoriaPracy partialUpdate(HistoriaPracyDto historiaPracyDto, @MappingTarget HistoriaPracy historiaPracy);
}