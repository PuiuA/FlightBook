package io.lazy.mapper;

import io.lazy.dto.AirportDTO;
import io.lazy.model.Airport;
import org.springframework.stereotype.Component;

@Component
public class AirportMapper {
    public AirportDTO toDTO(Airport airport) {
        return new AirportDTO(
                airport.getName(),
                airport.getCountry(),
                airport.getCity()
        );
    }
    public Airport toEntity(AirportDTO airportDTO) {
          Airport airport = new Airport();
          airport.setName(airportDTO.getName());
          airport.setCountry(airportDTO.getCountry());
          airport.setCity(airportDTO.getCity());
          return airport;
    }
}
