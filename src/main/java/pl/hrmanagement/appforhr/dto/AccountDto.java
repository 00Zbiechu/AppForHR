package pl.hrmanagement.appforhr.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Account} entity
 */
@Data
public class AccountDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String confirmPassword;
}