package pl.hrmanagement.appforhr.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginDto {

    @NotBlank(message = "Email can't be empty.")
    private String email;

    @NotBlank(message = "Password can't be empty.")
    private String password;

}
