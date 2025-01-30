package io.lazy.mapper;

import io.lazy.dto.ClientDTO;
import io.lazy.dto.FlightStatusDTO;
import io.lazy.model.Client;
import io.lazy.model.FlightStatus;
import io.lazy.repository.ClientRepository;
import io.lazy.repository.FlightStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientMapper {

    private final FlightStatusMapper flightStatusMapper;
    private final FlightStatusRepository flightStatusRepository;

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
