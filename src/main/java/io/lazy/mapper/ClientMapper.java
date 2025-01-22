package io.lazy.mapper;

import io.lazy.dto.ClientDTO;
import io.lazy.dto.FlightStatusDTO;
import io.lazy.model.Client;
import io.lazy.model.FlightStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientMapper {

    private final FlightStatusMapper flightStatusMapper;

    public ClientDTO toDTO(Client client) {
        return new ClientDTO(
                client.getFirstName(),
                client.getLastName(),
                client.getAge(),
                client.getGender(),
                flightStatusMapper.toDTO(client.getFlightStatus()));
    }
    public Client toEntity(ClientDTO clientDTO) {
        Client client = new Client();
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setGender(clientDTO.getGender());
        client.setAge(clientDTO.getAge());
        client.setFlightStatus(flightStatusMapper.toEntity(clientDTO.getFlightStatusDTO()));

        return client;
    }
}
