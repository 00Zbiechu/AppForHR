package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.KrajDto;
import pl.hrmanagement.appforhr.entity.Kraj;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface KrajMapper {
    Kraj toEntity(KrajDto krajDto);

    KrajDto toDto(Kraj kraj);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Kraj partialUpdate(KrajDto krajDto, @MappingTarget Kraj kraj);
}