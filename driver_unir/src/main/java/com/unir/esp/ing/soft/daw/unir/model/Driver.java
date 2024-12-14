package com.unir.esp.ing.soft.daw.unir.model;

import com.unir.esp.ing.soft.daw.unir.model.abstrac.BaseModel;
import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    private UUID userUuid;
    private String licenceNumber;
    private String vehiclePlate;
    private StatusDriver status;
}
