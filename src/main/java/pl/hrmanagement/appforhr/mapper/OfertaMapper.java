package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.entity.Oferta;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfertaMapper {
    Oferta toEntity(OfertaDto ofertaDto);

    OfertaDto toDto(Oferta oferta);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Oferta partialUpdate(OfertaDto ofertaDto, @MappingTarget Oferta oferta);
}