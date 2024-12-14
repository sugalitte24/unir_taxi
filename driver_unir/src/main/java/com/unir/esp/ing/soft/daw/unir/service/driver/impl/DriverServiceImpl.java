package com.unir.esp.ing.soft.daw.unir.service.driver.impl;

import com.unir.esp.ing.soft.daw.unir.dto.DriverDto;
import com.unir.esp.ing.soft.daw.unir.dto.DriverMapper;
import com.unir.esp.ing.soft.daw.unir.dto.DriverRequest;
import com.unir.esp.ing.soft.daw.unir.exceptions.DriverNotFound;
import com.unir.esp.ing.soft.daw.unir.model.Driver;
import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import com.unir.esp.ing.soft.daw.unir.repository.driver.DriverRepository;
import com.unir.esp.ing.soft.daw.unir.service.driver.DriverService;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    public List<DriverDto> findAll() {
        return driverMapper.toDtoList(driverRepository.findAll());
    }

    public Optional<DriverDto> findById( UUID uuid ) {
        Driver entity = driverRepository.findById(uuid).orElseThrow(
                () -> new DriverNotFound("Conductor no encontrado."));

        DriverDto UserDto = driverMapper.toDto(entity);
        return Optional.ofNullable(UserDto);
    }

    public Optional<DriverDto> findByLicenceNumber( String licenceNumber ) {
        Driver entity = driverRepository.findByLicenceNumber(licenceNumber).orElseThrow(
                () -> new DriverNotFound("Conductor no encontrado."));

        DriverDto dto = driverMapper.toDto(entity);
        return Optional.ofNullable(dto);
    }

    public List<DriverDto> findByStatus( StatusDriver statusDriver ) {
        List<Driver> entity = driverRepository.findByStatus(statusDriver);
        return driverMapper.toDtoList(entity);
    }

    @Transactional
    public DriverDto create( DriverRequest user ) {
        Driver entity = driverMapper.toModel(user);
        return driverMapper.toDto(driverRepository.save(entity));
    }

    @Transactional
    public Optional<DriverDto> update( UUID driverUuid, DriverDto user ) {
        Optional<Driver> entity = driverRepository.findById(driverUuid);
        if (entity.isEmpty()) {
            throw new DriverNotFound("Conductor no encontrado.");
        } else {
            driverMapper.update(user, entity.get());
            return Optional.ofNullable(driverMapper.toDto(driverRepository.save(entity.get())));
        }
    }

    @Override
    public String deleteById( UUID uuid ) {
        driverRepository.deleteById(uuid);
        return "Conductor eliminado correctamente.";
    }

}
