package pl.hrmanagement.appforhr.mapper;

import org.mapstruct.*;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.entity.Account;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {
    Account toEntity(AccountDto accountDto);

    AccountDto toDto(Account account);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Account partialUpdate(AccountDto accountDto, @MappingTarget Account account);
}