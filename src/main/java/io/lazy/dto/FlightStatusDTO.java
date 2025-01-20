package io.lazy.dto;

import io.lazy.model.StatusName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightStatusDTO {
    private StatusName name;
}
