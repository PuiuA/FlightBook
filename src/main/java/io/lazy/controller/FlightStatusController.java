package io.lazy.controller;

import io.lazy.model.FlightStatus;
import io.lazy.services.FlightStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/flight_status")
public class FlightStatusController {
    private final FlightStatusService flightStatusService;

    @GetMapping
    public List<FlightStatus> getAllFlightStatus() {
        return (List<FlightStatus>) flightStatusService.getAllFlightStatus();
    }
}
