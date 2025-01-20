package io.lazy.services;

import io.lazy.dto.AirplaneDTO;
import io.lazy.mapper.AirplaneMapper;
import io.lazy.model.Airplane;
import io.lazy.repository.AirplaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AirplaneService {
    private final AirplaneRepository airplaneRepository;
    private final AirplaneMapper airplaneMapper;

    public List<AirplaneDTO> getAllAirplanes() {
        return ((List<Airplane>) airplaneRepository.findAll())
                .stream()
                .map(airplaneMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AirplaneDTO getAirplaneById(Long id) {
        Airplane airplane = airplaneRepository.findById(id).orElseThrow(() -> new RuntimeException("Airplane not found"));
        return airplaneMapper.toDTO(airplane);
    }

    public AirplaneDTO saveAirplane(AirplaneDTO airplaneDTO) {
        Airplane airplane = airplaneMapper.toEntity(airplaneDTO);
        airplaneRepository.save(airplane);
        return airplaneMapper.toDTO(airplane);
    }
}
