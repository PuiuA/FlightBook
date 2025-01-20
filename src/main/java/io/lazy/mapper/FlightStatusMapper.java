package io.lazy.mapper;

import io.lazy.dto.FlightStatusDTO;
import io.lazy.model.FlightStatus;
import org.springframework.stereotype.Component;

@Component
public class FlightStatusMapper {
    public FlightStatusDTO toDTO(FlightStatus flightStatus) {
        return new FlightStatusDTO(flightStatus.getName());
    }
    public FlightStatus toEntity(FlightStatusDTO flightStatusDTO) {
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.setName(flightStatusDTO.getName());
        return flightStatus;
    }
}
