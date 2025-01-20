package io.lazy.services;

import io.lazy.model.FlightStatus;
import io.lazy.repository.FlightStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightStatusService {
    private final FlightStatusRepository flightStatusRepository;

    public List<FlightStatus> getAllFlightStatus() {
        return (List<FlightStatus>) flightStatusRepository.findAll();
    }
}
