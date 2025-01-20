package io.lazy.dto;

import io.lazy.model.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private FlightStatusDTO flightStatusDTO;
}
