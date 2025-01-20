package io.lazy.services;

import io.lazy.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.lazy.repository.ClientRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientRepository.findById(Long.valueOf(id)).orElse(null);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

}
