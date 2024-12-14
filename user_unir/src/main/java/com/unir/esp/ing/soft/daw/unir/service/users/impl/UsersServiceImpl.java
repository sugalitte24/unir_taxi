package com.unir.esp.ing.soft.daw.unir.service.users.impl;

import com.unir.esp.ing.soft.daw.unir.dto.UsersDto;
import com.unir.esp.ing.soft.daw.unir.dto.UsersMapper;
import com.unir.esp.ing.soft.daw.unir.dto.UsersRequest;
import com.unir.esp.ing.soft.daw.unir.exceptions.UserAlredyExist;
import com.unir.esp.ing.soft.daw.unir.exceptions.UserNotFound;
import com.unir.esp.ing.soft.daw.unir.model.Users;
import com.unir.esp.ing.soft.daw.unir.repository.users.UserRepository;
import com.unir.esp.ing.soft.daw.unir.service.users.UsersService;
import jakarta.transaction.Transactional;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UserRepository userRepository;
    private final UsersMapper usersMapper;

    public List<UsersDto> findAll() {
        return usersMapper.toDtoList(userRepository.findAll());
    }

    public Optional<UsersDto> findById( UUID uuid ) {
        Users entity = userRepository.findById(uuid).orElseThrow(
                () -> new UserNotFound("Usuario no encontrado."));

        UsersDto UserDto = usersMapper.toDto(entity);
        return Optional.ofNullable(UserDto);
    }

    public Optional<UsersDto> findByName( String name ) {
        Users entity = userRepository.findByName(name).orElseThrow(
                () -> new UserNotFound("Usuario no encontrado."));

        UsersDto dto = usersMapper.toDto(entity);
        return Optional.ofNullable(dto);
    }

    public Optional<UsersDto> findByPhone( String phone ) {
        Users entity = userRepository.findByPhone(phone).orElseThrow(
                () -> new UserNotFound("Usuario no encontrado."));

        UsersDto UserDto = usersMapper.toDto(entity);
        return Optional.ofNullable(UserDto);
    }

    @Transactional
    public UsersDto create( UsersRequest user ) {
        String password = Base64.getEncoder().encodeToString(user.getPassword().getBytes(StandardCharsets.UTF_8));
        user.setPassword(password);
        Users entity = usersMapper.toModel(user);
        validateUserExist(entity);
        return usersMapper.toDto(userRepository.save(entity));
    }

    @Transactional
    public Optional<UsersDto> update( UUID userUuid, UsersDto user ) {
        Optional<Users> entity = userRepository.findById(userUuid);
        if (entity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            usersMapper.update(user, entity.get());
            return Optional.ofNullable(usersMapper.toDto(userRepository.save(entity.get())));
        }
    }

    @Override
    public String deleteById( UUID uuid ) {
        userRepository.deleteById(uuid);
        return "Usuario eliminado correctamente.";
    }

    private void validateUserExist( Users users ) {
        if (userRepository.existsByPhone(users.getPhone())) {
            throw new UserAlredyExist("Ya existe un usuario con este número telefónico");
        }
    }
}
