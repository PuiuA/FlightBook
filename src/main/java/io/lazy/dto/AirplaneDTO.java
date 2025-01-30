package io.lazy.dto;

import io.lazy.model.Airplane;
import io.lazy.model.AirplaneCapacity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirplaneDTO {
    private String airplaneModel;
    private AirplaneCapacity airplaneCapacity;
    private Integer totalSeats;

    static public AirplaneDTO toDTO(Airplane airplane) {
        return new AirplaneDTO(
                airplane.getModel(),
                airplane.getAirplaneCapacity(),
                airplane.getAirplaneCapacity().getCapacity()
        );
    }
    static public Airplane toEntity(AirplaneDTO airplaneDTO) {
        Airplane airplane = new Airplane();
        airplane.setModel(airplaneDTO.getAirplaneModel());
        airplane.setAirplaneCapacity(airplaneDTO.getAirplaneCapacity());
        return airplane;
    }
}
