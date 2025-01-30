package io.lazy.dto;

import io.lazy.model.Airport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
    private String seatNumber;
    private ClientDTO client;
    private List<String> services;
    private Float price;
}
