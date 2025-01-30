package io.lazy.dto;

import io.lazy.model.FlightStatus;
import io.lazy.model.StatusName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightStatusDTO {
    private StatusName name;

    static public FlightStatusDTO toDTO(FlightStatus flightStatus) {
        return new FlightStatusDTO(flightStatus.getName());
    }
    static public FlightStatus toEntity(FlightStatusDTO flightStatusDTO) {
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.setName(flightStatusDTO.getName());
        return flightStatus;
    }
}
