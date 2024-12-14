package com.unir.esp.ing.soft.daw.unir.controller;

import com.unir.esp.ing.soft.daw.unir.dto.UsersDto;
import com.unir.esp.ing.soft.daw.unir.dto.UsersRequest;
import com.unir.esp.ing.soft.daw.unir.service.users.UsersService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping
    List<UsersDto> findAll() {
        return usersService.findAll();
    }

    @GetMapping("get-id/{userUuid}")
    Optional<UsersDto> findById( @PathVariable UUID userUuid ) {
        return usersService.findById(userUuid);
    }

    @GetMapping("get-name/{name}")
    Optional<UsersDto> findByName( @PathVariable String name ) {
        return usersService.findByName(name);
    }

    @GetMapping("get-phone/{phone}")
    Optional<UsersDto> findByPhone( @PathVariable String phone ) {
        return usersService.findByPhone(phone);
    }

    @PostMapping
    ResponseEntity<UsersDto> create( @Validated
                                     @RequestBody UsersRequest userRequest ) {
        return new ResponseEntity<>(usersService.create(userRequest), HttpStatus.CREATED);
    }

    @PatchMapping("/{userUuid}")
    Optional<UsersDto> update( @Validated
                               @PathVariable UUID userUuid,
                               @RequestBody UsersDto userDto ) {
        return usersService.update(userUuid, userDto);
    }

    @DeleteMapping("/{userUuid}")
    void deleteByUuid( @PathVariable UUID userUuid ) {
        usersService.deleteById(userUuid);
    }

}
