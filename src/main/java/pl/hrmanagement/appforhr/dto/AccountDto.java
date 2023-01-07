package pl.hrmanagement.appforhr.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link pl.hrmanagement.appforhr.entity.Account} entity
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto implements Serializable {

    @NotBlank(message = "First name can't be empty.")
    @Size(min = 0,max = 20, message = "Too long")
    private String firstName;

    @NotBlank(message = "Last name name can't be empty.")
    @Size(min = 0,max = 20, message = "Too long")
    private String lastName;

    @NotBlank(message = "Email can't be empty.")
    @Size(min = 0,max = 30, message = "Too long")
    private String email;

    @NotBlank(message = "Password can't be empty.")
    @Size(min = 0,max = 100, message = "Too long")
    private String password;
}