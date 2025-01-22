package io.lazy.controller;

import io.lazy.dto.TicketDTO;
import io.lazy.model.Ticket;
import io.lazy.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketService ticketService;

    @GetMapping
    public List<TicketDTO> getAllTickets(){ return  ticketService.getAllTickets();}

    @GetMapping("/{id}")
    public TicketDTO getTicketById(@PathVariable Long ticketId){ return ticketService.getTicketById(ticketId);}

    @PostMapping
    public TicketDTO saveTicket(@RequestBody TicketDTO ticketDTO){ return ticketService.saveTicket(ticketDTO); }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        ticketService.deleteTicketById(id);
        return new ResponseEntity<>("Client deleted", HttpStatus.OK);
    }
    @PutMapping
    public TicketDTO updateTicket(@RequestBody TicketDTO ticketDTO, Long id){
        return ticketService.updateTicket(id, ticketDTO);
    }
}
