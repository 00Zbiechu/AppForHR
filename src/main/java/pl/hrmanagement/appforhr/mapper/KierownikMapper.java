package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.KierownikDto;
import pl.hrmanagement.appforhr.entity.Kierownik;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface KierownikMapper {
    Kierownik toEntity(KierownikDto kierownikDto);

    KierownikDto toDto(Kierownik kierownik);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Kierownik partialUpdate(KierownikDto kierownikDto, @MappingTarget Kierownik kierownik);
}