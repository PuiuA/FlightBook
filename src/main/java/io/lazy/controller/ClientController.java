package io.lazy.controller;

import io.lazy.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.lazy.services.ClientService;
import io.lazy.model.Client;

import java.util.List;

//@RestControllerAdvice
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/{id}")
    public ClientDTO getClientById (@PathVariable Long id) { return clientService.getClientById(id);}

    @GetMapping
    public List<ClientDTO> getAllClients() { return clientService.getAllClients(); }

    @PostMapping
    public ClientDTO saveClient(@RequestBody ClientDTO clientDTO) { return clientService.saveClient(clientDTO); }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return new ResponseEntity<>("Client deleted", HttpStatus.OK);
    }

    @PutMapping
    public ClientDTO updateClient(@RequestBody ClientDTO clientDTO,Long id) { return clientService.updateClient(id,clientDTO); }

}
