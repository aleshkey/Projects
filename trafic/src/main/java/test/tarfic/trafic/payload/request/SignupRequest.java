package test.tarfic.trafic.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import test.tarfic.trafic.annotation.ValidEmail;

@Data
public class SignupRequest {
    @Email(message = "it should be email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "enter your name")
    private String name;
    @NotEmpty(message = "enter your username")
    private String username;
    @NotEmpty(message = "password is required")
    @Size(min = 8)
    private String password;
    private String confirmPassword;
}
