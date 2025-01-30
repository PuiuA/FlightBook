package io.lazy.services;

import io.lazy.dto.FlightStatusDTO;
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

    public List<FlightStatusDTO> getAllFlightStatus() {
        return ((List<FlightStatus>) flightStatusRepository.findAll())
                .stream()
                .map(FlightStatusDTO::toDTO)
                .collect(Collectors.toList());
    }

    public FlightStatusDTO getFlightStatusById(Long id) {
        FlightStatus flightStatus = flightStatusRepository.findById(id);
        return FlightStatusDTO.toDTO(flightStatus);
    }

    public FlightStatusDTO saveFlightStatus(FlightStatusDTO flightStatusDTO) {
        FlightStatus flightStatus = FlightStatusDTO.toEntity(flightStatusDTO);
        flightStatusRepository.save(flightStatus);
        return FlightStatusDTO.toDTO(flightStatus);
    }

    public FlightStatusDTO updateFlightStatus(Long id, FlightStatusDTO flightStatusDTO) {
        FlightStatus flightStatus = flightStatusRepository.findById(id);
        FlightStatus updatedFlightStatus = FlightStatusDTO.toEntity(flightStatusDTO);
        return FlightStatusDTO.toDTO(flightStatusRepository.save(updatedFlightStatus));
    }

    public void deleteFlightStatusById(Long id) {
        flightStatusRepository.deleteById(id);
    }

    public void deleteFlightStatus(FlightStatusDTO flightStatusDTO) {
        FlightStatus flightStatus = FlightStatusDTO.toEntity(flightStatusDTO);
        flightStatusRepository.delete(flightStatus);
    }
}
