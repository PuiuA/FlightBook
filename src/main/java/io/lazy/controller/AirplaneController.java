package io.lazy.controller;

import io.lazy.dto.AirplaneDTO;
import io.lazy.services.AirplaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airplanes")
public class AirplaneController {
    private final AirplaneService airplaneService;

    @GetMapping
    public List<AirplaneDTO> getAllAirplanes() {
        return airplaneService.getAllAirplanes();
    }

    @GetMapping("/{id}")
    public AirplaneDTO getAirplaneById (@PathVariable Long id) { return airplaneService.getAirplaneById(id);}

    @PostMapping
    public AirplaneDTO saveAirplane(@RequestBody AirplaneDTO airplaneDTO) { return airplaneService.saveAirplane(airplaneDTO);}

    @PutMapping
    public AirplaneDTO updateAirplane(@RequestBody AirplaneDTO airplaneDTO) {
        return airplaneService.updateAirplane(airplaneDTO);
    }

    @DeleteMapping("/byDTO")
    public void deleteAirplane(@RequestBody AirplaneDTO airplaneDTO) {
        airplaneService.deleteAirplane(airplaneDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAirplaneById(@PathVariable Long id) {
        airplaneService.deleteAirplaneById(id);
    }
}
