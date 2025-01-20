package io.lazy.services;

import io.lazy.dto.ClientDTO;
import io.lazy.mapper.ClientMapper;
import io.lazy.model.Client;
import io.lazy.model.FlightStatus;
import io.lazy.repository.FlightStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import io.lazy.repository.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final FlightStatusRepository flightStatusRepository;

    public List<ClientDTO> getAllClients() {
        return ((List<Client>) clientRepository.findAll())
                .stream()
                .map(clientMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
        return clientMapper.toDTO(client);
    }

    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = clientMapper.toEntity(clientDTO);

        // Obține FlightStatus existent din baza de date
        FlightStatus flightStatus = flightStatusRepository.findByName(clientDTO.getFlightStatusDTO().getName())
                .orElseThrow(() -> new RuntimeException("Flight status not found"));

        client.setFlightStatus(flightStatus);

        Client savedClient = clientRepository.save(client);
        return clientMapper.toDTO(savedClient);
    }

    public void deleteClient(Long id) { clientRepository.deleteById(id); }

}
