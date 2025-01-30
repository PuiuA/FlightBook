package io.lazy.services;

import io.lazy.dto.ClientDTO;
import io.lazy.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import io.lazy.repository.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClientService {
    private final ClientRepository clientRepository;


    public List<ClientDTO> getAllClients() {
        return ((List<Client>) clientRepository.findAll())
                .stream()
                .map(ClientDTO::toDTO)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id);
        return ClientDTO.toDTO(client);
    }

    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = ClientDTO.toEntity(clientDTO);
        Client savedClient = clientRepository.save(client);
        return ClientDTO.toDTO(savedClient);
    }

    public void deleteClientById(Long id) { clientRepository.deleteById(id); }

    public void deleteClient(ClientDTO clientDTO) {
        clientRepository.delete(ClientDTO.toEntity(clientDTO));
    }

    public ClientDTO updateClient(Long id,ClientDTO clientDTO) {
        Client client = clientRepository.findById(id);
        Client updatedClient = ClientDTO.toEntity(clientDTO);
        return ClientDTO.toDTO(clientRepository.save(updatedClient));
    }
}
