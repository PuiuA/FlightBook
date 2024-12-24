package services;

import io.lazy.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

import java.util.List;

@Service
public class ClientServices {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

    public Client updateClient(Integer id, Client client) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            existingClient.setFirstName(client.getFirstName());
            existingClient.setLastName(client.getLastName());
            existingClient.setAge(client.getAge());
            return clientRepository.save(existingClient);
        }
        return null;
    }
}
