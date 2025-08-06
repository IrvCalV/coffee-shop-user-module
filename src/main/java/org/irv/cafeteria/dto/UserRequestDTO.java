package org.irv.cafeteria.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class UserRequestDTO {
    private String username;
    private String mail;
    private String password;
    private String rol;
    private String firstName;
    private String lastName;
}
