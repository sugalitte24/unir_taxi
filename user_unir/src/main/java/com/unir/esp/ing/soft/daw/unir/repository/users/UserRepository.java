package com.unir.esp.ing.soft.daw.unir.repository.users;

import com.unir.esp.ing.soft.daw.unir.model.Users;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, UUID> {

    Optional<Users> findByName( String username );

    Optional<Users> findByPhone( String phone );

    boolean existsByPhone( String phone );
}
