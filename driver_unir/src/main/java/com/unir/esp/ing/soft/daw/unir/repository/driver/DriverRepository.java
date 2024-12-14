package com.unir.esp.ing.soft.daw.unir.repository.driver;

import com.unir.esp.ing.soft.daw.unir.model.Driver;
import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, UUID> {

    Optional<Driver> findByLicenceNumber( String licenceNumber );

    List<Driver> findByStatus( StatusDriver status );

}
