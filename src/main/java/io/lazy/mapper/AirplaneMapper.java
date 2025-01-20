package io.lazy.mapper;

import io.lazy.dto.AirplaneDTO;
import io.lazy.model.Airplane;
import org.springframework.stereotype.Component;

@Component
public class AirplaneMapper {
    public AirplaneDTO toDTO(Airplane airplane) {
        return new AirplaneDTO(
                airplane.getModel(),
                airplane.getPlaneCapacity()
        );
    }
    public Airplane toEntity(AirplaneDTO airplaneDTO) {
        Airplane airplane = new Airplane();
        airplane.setModel(airplaneDTO.getAirplaneModel());
        airplane.setPlaneCapacity(airplaneDTO.getAirplaneCapacity());
        return airplane;
    }
}
