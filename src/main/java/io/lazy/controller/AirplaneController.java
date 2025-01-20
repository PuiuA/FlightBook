package io.lazy.controller;

import io.lazy.model.AirPlane;
import io.lazy.services.AirplaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airplanes")
public class AirplaneController {
    private final AirplaneService airplaneService;

    @GetMapping
    public List<AirPlane> getAllAirplane() {
        return airplaneService.getAllAirplane();
    }
}
