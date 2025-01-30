package io.lazy.services;


import io.lazy.dto.TicketDTO;
import io.lazy.model.Ticket;
import io.lazy.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public List<TicketDTO> getAllTickets() {
        return ((List<Ticket>) ticketRepository.findAll())
                .stream().map(TicketDTO::toDTO).
                collect(Collectors.toList());
    }

    public TicketDTO getTicketById(Long id) {
        Ticket ticket = ticketRepository.findById(id);
        return TicketDTO.toDTO(ticket);
    }

    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        return TicketDTO.toDTO(ticketRepository.save(TicketDTO.toEntity(ticketDTO)));
    }

    public TicketDTO updateTicket(Long id, TicketDTO ticketDTO) {
        Ticket ticket = ticketRepository.findById(id);
        if (ticket != null) {
            ticketRepository.save(TicketDTO.toEntity(ticketDTO));
        }else {
            return null;
        }
        return TicketDTO.toDTO(ticket);
    }

    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }

}
