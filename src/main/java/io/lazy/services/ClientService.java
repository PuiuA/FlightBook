package io.lazy.services;

import io.lazy.dto.ClientDTO;
import io.lazy.mapper.ClientMapper;
import io.lazy.model.Client;
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

    public List<ClientDTO> getAllClients() {
        return ((List<Client>) clientRepository.findAll())
                .stream()
                .map(clientMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id);
        return clientMapper.toDTO(client);
    }

    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = clientMapper.toEntity(clientDTO);
        Client savedClient = clientRepository.save(client);
        return clientMapper.toDTO(savedClient);
    }

    public void deleteClientById(Long id) { clientRepository.deleteById(id); }

    public void deleteClient(ClientDTO clientDTO) {
        clientRepository.delete(clientMapper.toEntity(clientDTO));
    }

    public ClientDTO updateClient(Long id,ClientDTO clientDTO) {
        Client client = clientRepository.findById(id);
        Client updatedClient = clientMapper.toEntity(clientDTO);
        return clientMapper.toDTO(clientRepository.save(updatedClient));
    }
}
