package com.unir.esp.ing.soft.daw.unir.model;

import com.unir.esp.ing.soft.daw.unir.model.abstrac.BaseModel;
import com.unir.esp.ing.soft.daw.unir.model.enums.Roles;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "users", schema = "driver_unir")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseModel {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private Roles role;
}
