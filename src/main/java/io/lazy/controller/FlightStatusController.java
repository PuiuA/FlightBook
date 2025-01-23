package io.lazy.controller;

import io.lazy.dto.FlightStatusDTO;
import io.lazy.services.FlightStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/flight_status")
public class FlightStatusController {
    private final FlightStatusService flightStatusService;

    @GetMapping
    public List<FlightStatusDTO> getAllFlightStatus() {
        return flightStatusService.getAllFlightStatus();
    }

    @GetMapping("/{id}")
    public FlightStatusDTO getFlightStatus(@PathVariable Long id) {
        return flightStatusService.getFlightStatusById(id);
    }
    @PostMapping
    public FlightStatusDTO createFlightStatus(@RequestBody FlightStatusDTO flightStatusDTO) {
        return flightStatusService.saveFlightStatus(flightStatusDTO);
    }
    @PutMapping("/{id}")
    public FlightStatusDTO updateFlightStatus(@RequestBody Long id,FlightStatusDTO flightStatusDTO) {
        return flightStatusService.updateFlightStatus(id,flightStatusDTO);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteFlightStatus(@RequestBody FlightStatusDTO flightStatusDTO) {
        flightStatusService.deleteFlightStatus(flightStatusDTO);
        return new ResponseEntity<>("Flight Status deleted", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        flightStatusService.deleteFlightStatusById(id);
    }
}
