package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DriverDto {

    public UUID uuid;
    private UUID userUuid;
    private String licenceNumber;
    private String vehiclePlate;
    private StatusDriver status;
    public LocalDateTime createdAt;
    public LocalDateTime lastModifiedAt;
}
