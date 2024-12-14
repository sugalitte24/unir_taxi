package com.unir.esp.ing.soft.daw.unir.controller;

import com.unir.esp.ing.soft.daw.unir.dto.DriverDto;
import com.unir.esp.ing.soft.daw.unir.dto.DriverRequest;
import com.unir.esp.ing.soft.daw.unir.model.enums.StatusDriver;
import com.unir.esp.ing.soft.daw.unir.service.driver.DriverService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/driver")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @GetMapping
    List<DriverDto> findAll() {
        return driverService.findAll();
    }

    @GetMapping("get-id/{driverUuid}")
    Optional<DriverDto> findById( @PathVariable UUID driverUuid ) {
        return driverService.findById(driverUuid);
    }

    @GetMapping("get-licence/{licenceNumber}")
    Optional<DriverDto> findByLicenceNumber( @PathVariable String licenceNumber ) {
        return driverService.findByLicenceNumber(licenceNumber);
    }

    @GetMapping("get-by-status/{statusDriver}")
    List<DriverDto> findByPhone( @PathVariable StatusDriver statusDriver ) {
        return driverService.findByStatus(statusDriver);
    }

    @PostMapping
    ResponseEntity<DriverDto> create( @Validated
                                     @RequestBody DriverRequest driverRequest ) {
        return new ResponseEntity<>(driverService.create(driverRequest), HttpStatus.CREATED);
    }

    @PatchMapping("/{driverUuid}")
    Optional<DriverDto> update( @Validated
                               @PathVariable UUID driverUuid,
                                @RequestBody DriverDto userDto ) {
        return driverService.update(driverUuid, userDto);
    }

    @DeleteMapping("/{driverUuid}")
    void deleteByUuid( @PathVariable UUID driverUuid ) {
        driverService.deleteById(driverUuid);
    }

}
