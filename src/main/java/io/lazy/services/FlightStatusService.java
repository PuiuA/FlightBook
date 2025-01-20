package io.lazy.services;

import io.lazy.dto.FlightStatusDTO;
import io.lazy.mapper.FlightStatusMapper;
import io.lazy.model.FlightStatus;
import io.lazy.repository.FlightStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FlightStatusService {
    private final FlightStatusRepository flightStatusRepository;
    private final FlightStatusMapper flightStatusMapper;

    public List<FlightStatusDTO> getAllFlightStatus() {
        return ((List<FlightStatus>) flightStatusRepository.findAll())
                .stream()
                .map(flightStatusMapper::toDTO)
                .collect(Collectors.toList());
    }
}
