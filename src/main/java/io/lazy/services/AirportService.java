package io.lazy.services;

import io.lazy.model.Airport;
import io.lazy.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportService {
    private final AirportRepository airportRepository;

    public List<Airport> getAllAirports(){
        return (List<Airport>) airportRepository.findAll();
    }
}
