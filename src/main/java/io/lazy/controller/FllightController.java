package io.lazy.controller;

import io.lazy.dto.FlightDTO;
import io.lazy.services.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/flights")
public class FllightController {
    private final FlightService flightService;

    @GetMapping("/{id}")
    public FlightDTO getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
    @GetMapping
    public List<FlightDTO> getAllFlights() {
        return flightService.getAllFlights();
    }
    @PostMapping
    public FlightDTO saveFlight(@RequestBody FlightDTO flightDTO) {
        return flightService.saveFlight(flightDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteFlightById(@PathVariable Long id) {
        flightService.deleteFlightById(id);
    }
    @DeleteMapping
    public void deleteFlight(@RequestBody FlightDTO flightDTO) {
        flightService.deleteFlight(flightDTO);
    }

}
