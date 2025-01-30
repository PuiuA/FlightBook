package io.lazy.services;


import io.lazy.dto.FlightDTO;
import io.lazy.model.Flight;
import io.lazy.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightRepository flightRepository;

    public List<FlightDTO> getAllFlights() {
        return ((List<Flight>)flightRepository.findAll())
                .stream()
                .map(FlightDTO::toDTO)
                .collect(Collectors.toList());
    }

    public FlightDTO getFlightById(Long id) {
        return FlightDTO.toDTO(flightRepository.findById(id));
    }

    public FlightDTO saveFlight(FlightDTO flightDTO) {
        return FlightDTO.toDTO(flightRepository.save(FlightDTO.toEntity(flightDTO)));
    }

    public FlightDTO updateFlight(FlightDTO flightDTO) {
        return FlightDTO.toDTO(flightRepository.update(FlightDTO.toEntity(flightDTO)));
    }
    public void deleteFlightById(Long id) {
        flightRepository.deleteById(id);
    }
    public void deleteFlight(FlightDTO flightDTO) {
        flightRepository.delete(FlightDTO.toEntity(flightDTO));
    }
}
