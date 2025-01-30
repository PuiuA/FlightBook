package io.lazy.mapper;

import io.lazy.dto.TicketDTO;
import io.lazy.model.Service;
import io.lazy.model.ServiceType;
import io.lazy.model.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Component
public class TicketMapper {
    private final ClientMapper clientMapper;
    private final AirportMapper airportMapper;


    public TicketDTO toDTO(Ticket ticket) {

        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setClient(clientMapper.toDTO(ticket.getClient()));
        ticketDTO.setArrivalAirport(airportMapper.toDTO(ticket.getArrivalAirport()));
        ticketDTO.setDepartureAirport(airportMapper.toDTO(ticket.getDepartureAirport()));
        ticketDTO.setDepartureDateTime(ticket.getDepartureDateTime());
        ticketDTO.setArrivalDateTime(ticket.getArrivalDateTime());

        ticketDTO.setServices( ticket.getServices().stream()
                .map(service -> service.getName().name())
                .collect(Collectors.toList()));

        ticketDTO.setPrice(ticket.getPrice());

        return ticketDTO;
    }

    public Ticket toEntity(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        ticket.setClient(clientMapper.toEntity(ticketDTO.getClient()));
        ticket.setDepartureAirport(airportMapper.toEntity(ticketDTO.getArrivalAirport()));
        ticket.setArrivalAirport(airportMapper.toEntity(ticketDTO.getDepartureAirport()));
        ticket.setDepartureDateTime(ticketDTO.getDepartureDateTime());
        ticket.setArrivalDateTime(ticketDTO.getArrivalDateTime());

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
