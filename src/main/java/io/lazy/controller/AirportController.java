package io.lazy.controller;

import io.lazy.dto.AirportDTO;
import io.lazy.model.Airport;
import io.lazy.services.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airports")
public class AirportController {
     private final AirportService airportService;

     @GetMapping
     public List<AirportDTO> getAllAirports() { return airportService.getAllAirports();}
}
