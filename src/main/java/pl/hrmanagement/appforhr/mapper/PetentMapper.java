package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.PetentDto;
import pl.hrmanagement.appforhr.entity.Petent;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PetentMapper {
    Petent toEntity(PetentDto petentDto);

    PetentDto toDto(Petent petent);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Petent partialUpdate(PetentDto petentDto, @MappingTarget Petent petent);
}