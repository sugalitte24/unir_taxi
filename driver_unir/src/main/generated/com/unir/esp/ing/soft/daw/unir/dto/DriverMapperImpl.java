package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.dto.DriverDto.DriverDtoBuilder;
import com.unir.esp.ing.soft.daw.unir.model.Driver;
import com.unir.esp.ing.soft.daw.unir.model.Driver.DriverBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T19:33:46-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public DriverDto toDto(Driver driver) {
        if ( driver == null ) {
            return null;
        }

        DriverDtoBuilder driverDto = DriverDto.builder();

        if ( driver.uuid != null ) {
            driverDto.uuid( driver.uuid );
        }
        if ( driver.getUserUuid() != null ) {
            driverDto.userUuid( driver.getUserUuid() );
        }
        if ( driver.getLicenceNumber() != null ) {
            driverDto.licenceNumber( driver.getLicenceNumber() );
        }
        if ( driver.getVehiclePlate() != null ) {
            driverDto.vehiclePlate( driver.getVehiclePlate() );
        }
        if ( driver.getStatus() != null ) {
            driverDto.status( driver.getStatus() );
        }
        if ( driver.createdAt != null ) {
            driverDto.createdAt( driver.createdAt );
        }
        if ( driver.lastModifiedAt != null ) {
            driverDto.lastModifiedAt( driver.lastModifiedAt );
        }

        return driverDto.build();
    }

    @Override
    public Driver toModel(DriverDto driverDto) {
        if ( driverDto == null ) {
            return null;
        }

        DriverBuilder driver = Driver.builder();

        if ( driverDto.getUserUuid() != null ) {
            driver.userUuid( driverDto.getUserUuid() );
        }
        if ( driverDto.getLicenceNumber() != null ) {
            driver.licenceNumber( driverDto.getLicenceNumber() );
        }
        if ( driverDto.getVehiclePlate() != null ) {
            driver.vehiclePlate( driverDto.getVehiclePlate() );
        }
        if ( driverDto.getStatus() != null ) {
            driver.status( driverDto.getStatus() );
        }

        return driver.build();
    }

    @Override
    public Driver toModel(DriverRequest driverRequest) {
        if ( driverRequest == null ) {
            return null;
        }

        DriverBuilder driver = Driver.builder();

        if ( driverRequest.getUserUuid() != null ) {
            driver.userUuid( driverRequest.getUserUuid() );
        }
        if ( driverRequest.getLicenceNumber() != null ) {
            driver.licenceNumber( driverRequest.getLicenceNumber() );
        }
        if ( driverRequest.getVehiclePlate() != null ) {
            driver.vehiclePlate( driverRequest.getVehiclePlate() );
        }
        if ( driverRequest.getStatus() != null ) {
            driver.status( driverRequest.getStatus() );
        }

        return driver.build();
    }

    @Override
    public List<DriverDto> toDtoList(List<Driver> users) {
        if ( users == null ) {
            return null;
        }

        List<DriverDto> list = new ArrayList<DriverDto>( users.size() );
        for ( Driver driver : users ) {
            list.add( toDto( driver ) );
        }

        return list;
    }

    @Override
    public void update(DriverDto driverDto, Driver driver) {
        if ( driverDto == null ) {
            return;
        }

        if ( driverDto.getUserUuid() != null ) {
            driver.setUserUuid( driverDto.getUserUuid() );
        }
        if ( driverDto.getLicenceNumber() != null ) {
            driver.setLicenceNumber( driverDto.getLicenceNumber() );
        }
        if ( driverDto.getVehiclePlate() != null ) {
            driver.setVehiclePlate( driverDto.getVehiclePlate() );
        }
        if ( driverDto.getStatus() != null ) {
            driver.setStatus( driverDto.getStatus() );
        }
        if ( driverDto.getUuid() != null ) {
            driver.uuid = driverDto.getUuid();
        }
        if ( driverDto.getCreatedAt() != null ) {
            driver.createdAt = driverDto.getCreatedAt();
        }
        if ( driverDto.getLastModifiedAt() != null ) {
            driver.lastModifiedAt = driverDto.getLastModifiedAt();
        }
    }
}
