package com.unir.esp.ing.soft.daw.unir.service.driver;

import com.unir.esp.ing.soft.daw.unir.dto.DriverDto;
import com.unir.esp.ing.soft.daw.unir.dto.DriverRequest;
import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DriverService {
    List<DriverDto> findAll();

    Optional<DriverDto> findById( UUID uuid );

    Optional<DriverDto> findByLicenceNumber( String licenceNumber );

    List<DriverDto> findByStatus( StatusDriver statusDriver );

    DriverDto create( DriverRequest user );

    Optional<DriverDto> update( UUID userUuid, DriverDto user );

    String deleteById( UUID uuid );
}
