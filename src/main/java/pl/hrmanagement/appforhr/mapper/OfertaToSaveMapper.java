package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.OfertaDto;
import pl.hrmanagement.appforhr.dto.OfertaToSaveDTO;
import pl.hrmanagement.appforhr.entity.Oferta;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OfertaToSaveMapper {
    Oferta toEntity(OfertaToSaveDTO ofertaToSaveDTO);

    OfertaToSaveDTO toDto(Oferta oferta);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Oferta partialUpdate(OfertaToSaveDTO ofertaToSaveDTO, @MappingTarget Oferta oferta);

}
