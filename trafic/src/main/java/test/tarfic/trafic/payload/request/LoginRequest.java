package test.tarfic.trafic.payload.request;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

@Data
public class LoginRequest {
    @NotEmpty(message = "email cant be empty")
    private String email;
    @NotEmpty(message = "password cant be empty")
    private String password;
}
