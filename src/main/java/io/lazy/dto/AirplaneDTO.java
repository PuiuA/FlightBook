package io.lazy.dto;

import io.lazy.model.PlaneCapacity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirplaneDTO {
    private String airplaneModel;
    private PlaneCapacity planeCapacity;
}
