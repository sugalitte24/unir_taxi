package com.unir.esp.ing.soft.daw.unir.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DriverNotFound extends RuntimeException {
    private String message;

    public DriverNotFound( String msg ) {
        super(msg);
        this.message = msg;
    }
}
