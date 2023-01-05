package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.DzialDto;
import pl.hrmanagement.appforhr.entity.Dzial;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DzialMapper {
    Dzial toEntity(DzialDto dzialDto);

    DzialDto toDto(Dzial dzial);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Dzial partialUpdate(DzialDto dzialDto, @MappingTarget Dzial dzial);
}