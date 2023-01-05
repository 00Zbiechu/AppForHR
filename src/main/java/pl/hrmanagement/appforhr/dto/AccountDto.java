package pl.hrmanagement.appforhr.dto;

import lombok.Data;
import pl.hrmanagement.appforhr.entity.Account;

import java.io.Serializable;

/**
 * A DTO for the {@link Account} entity
 */
@Data
public class AccountDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}