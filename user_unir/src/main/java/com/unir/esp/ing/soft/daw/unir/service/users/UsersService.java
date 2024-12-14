package com.unir.esp.ing.soft.daw.unir.service.users;

import com.unir.esp.ing.soft.daw.unir.dto.UsersDto;
import com.unir.esp.ing.soft.daw.unir.dto.UsersRequest;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersService {
    List<UsersDto> findAll();

    Optional<UsersDto> findById( UUID uuid );

    Optional<UsersDto> findByName( String name );

    Optional<UsersDto> findByPhone( String phone );

    UsersDto create( UsersRequest user );

    Optional<UsersDto> update( UUID userUuid, UsersDto user );

    String deleteById( UUID uuid );
}
