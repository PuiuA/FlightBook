package io.lazy.controller;

import io.lazy.dto.AirportDTO;
import io.lazy.model.Airport;
import io.lazy.services.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airports")
public class AirportController {
     private final AirportService airportService;

     @GetMapping
     public List<AirportDTO> getAllAirports() { return airportService.getAllAirports();}

     @GetMapping("/{id}")
     public AirportDTO getAirportById(@PathVariable Long id) { return airportService.getAirportById(id);}

     @PostMapping
     public AirportDTO saveAirport(@RequestBody AirportDTO airportDTO) {
          return airportService.saveAirport(airportDTO);
     }
     @DeleteMapping("/{id}")
     public void deleteAirportById(@PathVariable Long id) {
          airportService.deleteAirportById(id);
     }
     @DeleteMapping
     public void deleteAirport(@RequestBody AirportDTO airportDTO) {
          airportService.deleteAirport(airportDTO);
     }
}
