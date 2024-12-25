package controller;

import org.springframework.web.bind.annotation.*;
import services.ClientService;
import io.lazy.model.Client;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8480")
@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientService clientService;

    // dependency injection
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Integer id) {
        clientService.deleteClient(id);
    }

    @PostMapping
    public Client createClient(
            @RequestParam Integer id,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam Integer age
    ) {
        Client client = new Client();
        client.setId(id);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setAge(age);
        return clientService.saveClient(client);
    }
}
