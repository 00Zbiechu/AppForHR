package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.HeadhunterDto;
import pl.hrmanagement.appforhr.entity.Headhunter;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HeadhunterMapper {
    Headhunter toEntity(HeadhunterDto headhunterDto);

    HeadhunterDto toDto(Headhunter headhunter);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Headhunter partialUpdate(HeadhunterDto headhunterDto, @MappingTarget Headhunter headhunter);
}