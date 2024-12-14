package com.unir.esp.ing.soft.daw.unir.exceptions;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionsDto {

    private int statusCode;
    private String message;
}
