package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.model.enums.Roles;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UsersDto {

    public UUID uuid;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private Roles role;
    public LocalDateTime createdAt;
    public LocalDateTime lastModifiedAt;
}
