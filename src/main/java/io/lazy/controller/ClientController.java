package io.lazy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.lazy.services.ClientService;
import io.lazy.model.Client;
import java.util.List;

@RestControllerAdvice
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;
    // dependency injection
//    @Autowired
//    public ClientController(ClientService clientService) {
//        this.clientService = clientService;
//    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

}
