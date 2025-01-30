package io.lazy.dto;

import io.lazy.model.Airport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportDTO {
    private String name;
    private String country;
    private String city;

    static public AirportDTO toDTO(Airport airport) {
        return new AirportDTO(
                airport.getName(),
                airport.getCountry(),
                airport.getCity()
        );
    }
    static public Airport toEntity(AirportDTO airportDTO) {
        Airport airport = new Airport();
        airport.setName(airportDTO.getName());
        airport.setCountry(airportDTO.getCountry());
        airport.setCity(airportDTO.getCity());
        return airport;
    }
}
