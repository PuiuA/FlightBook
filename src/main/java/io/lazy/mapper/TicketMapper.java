package io.lazy.mapper;

import io.lazy.dto.TicketDTO;
import io.lazy.model.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

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
        return ticketDTO;
    }

    public Ticket toEntity(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        ticket.setClient(clientMapper.toEntity(ticketDTO.getClient()));
        ticket.setDepartureAirport(airportMapper.toEntity(ticketDTO.getArrivalAirport()));
        ticket.setArrivalAirport(airportMapper.toEntity(ticketDTO.getDepartureAirport()));
        ticket.setDepartureDateTime(ticketDTO.getDepartureDateTime());
        ticket.setArrivalDateTime(ticketDTO.getArrivalDateTime());
        return ticket;
    }
}
