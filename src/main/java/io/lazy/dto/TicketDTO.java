package io.lazy.dto;


import io.lazy.model.Service;
import io.lazy.model.ServiceType;
import io.lazy.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
    private String seatNumber;
    private ClientDTO client;
    private List<String> services;
    private Float price;

    static public TicketDTO toDTO(Ticket ticket) {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setClient(ClientDTO.toDTO(ticket.getClient()));
        ticketDTO.setServices( ticket.getServices().stream()
                .map(service -> service.getName().name())
                .collect(Collectors.toList()));

        ticketDTO.setPrice(ticket.getPrice());

        return ticketDTO;
    }

    static public Ticket toEntity(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        ticket.setClient(ClientDTO.toEntity(ticketDTO.getClient()));
        ticket.setServices((ArrayList<Service>) ticketDTO.getServices().stream()
                .map(serviceName -> {
                    Service service = new Service();
                    service.setName(ServiceType.valueOf(serviceName));
                    return service;
                })
                .collect(Collectors.toList()));

        return ticket;
    }
}
