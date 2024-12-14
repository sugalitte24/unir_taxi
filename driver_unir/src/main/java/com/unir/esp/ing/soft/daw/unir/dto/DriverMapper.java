package com.unir.esp.ing.soft.daw.unir.dto;

import com.unir.esp.ing.soft.daw.unir.model.Driver;
import java.util.List;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface DriverMapper {

    DriverDto toDto( Driver driver );

    Driver toModel( DriverDto driverDto );

    Driver toModel( DriverRequest driverRequest );

    List<DriverDto> toDtoList( List<Driver> users);

    void update( DriverDto driverDto, @MappingTarget Driver driver );

}
