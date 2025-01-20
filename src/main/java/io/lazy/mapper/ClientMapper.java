package io.lazy.mapper;

import io.lazy.dto.ClientDTO;
import io.lazy.dto.FlightStatusDTO;
import io.lazy.model.Client;
import io.lazy.model.FlightStatus;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDTO toDTO(Client client) {
        FlightStatusDTO flightStatusDTO = new FlightStatusDTO(client.getFlightStatus().getName());
        return new ClientDTO(
                client.getFirstName(),
                client.getLastName(),
                client.getAge(),
                client.getGender(),
                flightStatusDTO);
    }
    public Client toEntity(ClientDTO clientDTO) {
        Client client = new Client();
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setGender(clientDTO.getGender());

        FlightStatus flightStatus = new FlightStatus(clientDTO.getFlightStatusDTO().getName());
        client.setFlightStatus(flightStatus);

        return client;
    }
}
