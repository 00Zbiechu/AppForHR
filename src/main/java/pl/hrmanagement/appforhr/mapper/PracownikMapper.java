package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.PracownikDto;
import pl.hrmanagement.appforhr.entity.Pracownik;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PracownikMapper {
    Pracownik toEntity(PracownikDto pracownikDto);

    PracownikDto toDto(Pracownik pracownik);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Pracownik partialUpdate(PracownikDto pracownikDto, @MappingTarget Pracownik pracownik);
}