package io.lazy.services;

import io.lazy.dto.AirportDTO;
import io.lazy.mapper.AirportMapper;
import io.lazy.model.Airport;
import io.lazy.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AirportService {
    private final AirportRepository airportRepository;
    private final AirportMapper airportMapper;

    public List<AirportDTO> getAllAirports(){
        return ((List<Airport>) airportRepository.findAll())
                .stream()
                .map(airportMapper::toDTO)
                .collect(Collectors.toList());
    }
}
