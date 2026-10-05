package at.tlr.llmgateway.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {
    private String email;
    private String password;
    private float balance;
}
