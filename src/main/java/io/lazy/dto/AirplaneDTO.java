package io.lazy.dto;

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
}
