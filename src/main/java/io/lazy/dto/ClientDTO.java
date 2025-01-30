package io.lazy.dto;

import io.lazy.model.Client;
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
    private FlightStatusDTO flightStatus;

    static public ClientDTO toDTO(Client client) {
        return new ClientDTO(
                client.getFirstName(),
                client.getLastName(),
                client.getAge(),
                client.getGender(),
                FlightStatusDTO.toDTO(client.getFlightStatus()));
    }
    static public Client toEntity(ClientDTO clientDTO) {
        Client client = new Client();
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.setName(clientDTO.getFlightStatus().getName());

        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setGender(clientDTO.getGender());
        client.setAge(clientDTO.getAge());
        client.setFlightStatus(flightStatus);

        return client;
    }
}
