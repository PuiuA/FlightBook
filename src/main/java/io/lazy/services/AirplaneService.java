package io.lazy.services;

import io.lazy.model.AirPlane;
import io.lazy.repository.AirplaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirplaneService {
    private final AirplaneRepository airplaneRepository;

    public List<AirPlane> getAllAirplane() {
        return (List<AirPlane>) airplaneRepository.findAll();
    }
}
