package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.dto.UsersDto.UsersDtoBuilder;
import com.unir.esp.ing.soft.daw.unir.model.Users;
import com.unir.esp.ing.soft.daw.unir.model.Users.UsersBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T19:30:38-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UsersDto toDto(Users users) {
        if ( users == null ) {
            return null;
        }

        UsersDtoBuilder usersDto = UsersDto.builder();

        if ( users.uuid != null ) {
            usersDto.uuid( users.uuid );
        }
        if ( users.getName() != null ) {
            usersDto.name( users.getName() );
        }
        if ( users.getPassword() != null ) {
            usersDto.password( users.getPassword() );
        }
        if ( users.getEmail() != null ) {
            usersDto.email( users.getEmail() );
        }
        if ( users.getPhone() != null ) {
            usersDto.phone( users.getPhone() );
        }
        if ( users.getAddress() != null ) {
            usersDto.address( users.getAddress() );
        }
        if ( users.getRole() != null ) {
            usersDto.role( users.getRole() );
        }
        if ( users.createdAt != null ) {
            usersDto.createdAt( users.createdAt );
        }
        if ( users.lastModifiedAt != null ) {
            usersDto.lastModifiedAt( users.lastModifiedAt );
        }

        return usersDto.build();
    }

    @Override
    public Users toModel(UsersDto usersDto) {
        if ( usersDto == null ) {
            return null;
        }

        UsersBuilder users = Users.builder();

        if ( usersDto.getName() != null ) {
            users.name( usersDto.getName() );
        }
        if ( usersDto.getPassword() != null ) {
            users.password( usersDto.getPassword() );
        }
        if ( usersDto.getEmail() != null ) {
            users.email( usersDto.getEmail() );
        }
        if ( usersDto.getPhone() != null ) {
            users.phone( usersDto.getPhone() );
        }
        if ( usersDto.getAddress() != null ) {
            users.address( usersDto.getAddress() );
        }
        if ( usersDto.getRole() != null ) {
            users.role( usersDto.getRole() );
        }

        return users.build();
    }

    @Override
    public Users toModel(UsersRequest usersRequest) {
        if ( usersRequest == null ) {
            return null;
        }

        UsersBuilder users = Users.builder();

        if ( usersRequest.getName() != null ) {
            users.name( usersRequest.getName() );
        }
        if ( usersRequest.getPassword() != null ) {
            users.password( usersRequest.getPassword() );
        }
        if ( usersRequest.getEmail() != null ) {
            users.email( usersRequest.getEmail() );
        }
        if ( usersRequest.getPhone() != null ) {
            users.phone( usersRequest.getPhone() );
        }
        if ( usersRequest.getAddress() != null ) {
            users.address( usersRequest.getAddress() );
        }
        if ( usersRequest.getRole() != null ) {
            users.role( usersRequest.getRole() );
        }

        return users.build();
    }

    @Override
    public List<UsersDto> toDtoList(List<Users> users) {
        if ( users == null ) {
            return null;
        }

        List<UsersDto> list = new ArrayList<UsersDto>( users.size() );
        for ( Users users1 : users ) {
            list.add( toDto( users1 ) );
        }

        return list;
    }

    @Override
    public void update(UsersDto usersDto, Users users) {
        if ( usersDto == null ) {
            return;
        }

        if ( usersDto.getName() != null ) {
            users.setName( usersDto.getName() );
        }
        if ( usersDto.getPassword() != null ) {
            users.setPassword( usersDto.getPassword() );
        }
        if ( usersDto.getEmail() != null ) {
            users.setEmail( usersDto.getEmail() );
        }
        if ( usersDto.getPhone() != null ) {
            users.setPhone( usersDto.getPhone() );
        }
        if ( usersDto.getAddress() != null ) {
            users.setAddress( usersDto.getAddress() );
        }
        if ( usersDto.getRole() != null ) {
            users.setRole( usersDto.getRole() );
        }
        if ( usersDto.getUuid() != null ) {
            users.uuid = usersDto.getUuid();
        }
        if ( usersDto.getCreatedAt() != null ) {
            users.createdAt = usersDto.getCreatedAt();
        }
        if ( usersDto.getLastModifiedAt() != null ) {
            users.lastModifiedAt = usersDto.getLastModifiedAt();
        }
    }
}
