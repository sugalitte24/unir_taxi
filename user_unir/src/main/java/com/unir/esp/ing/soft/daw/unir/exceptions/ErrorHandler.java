package com.unir.esp.ing.soft.daw.unir.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = UserAlredyExist.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public @ResponseBody ExceptionsDto handleUserAlreadyExistsException( UserAlredyExist ex ) {
        return new ExceptionsDto(HttpStatus.CONFLICT.value(), ex.getMessage());
    }

    @ExceptionHandler(value = UserNotFound.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public @ResponseBody ExceptionsDto handleUserNotFoundException( UserNotFound ex ) {
        return new ExceptionsDto(HttpStatus.CONFLICT.value(), ex.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ExceptionsDto handleUserMethodNotValidException( MethodArgumentNotValidException ex ) {
        return new ExceptionsDto(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody ExceptionsDto handleUserExceptionExistsException( Exception ex ) {
        return new ExceptionsDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }
}
