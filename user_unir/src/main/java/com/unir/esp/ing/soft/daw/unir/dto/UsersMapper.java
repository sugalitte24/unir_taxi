package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.model.Users;
import java.util.List;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UsersMapper {

    UsersDto toDto( Users users);

    Users toModel( UsersDto usersDto );

    Users toModel( UsersRequest usersRequest );

    List<UsersDto> toDtoList( List<Users> users);

    void update( UsersDto usersDto, @MappingTarget Users users);

}
