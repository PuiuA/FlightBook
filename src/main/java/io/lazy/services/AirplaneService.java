package io.lazy.services;

import io.lazy.dto.AirplaneDTO;
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

    public List<AirplaneDTO> getAllAirplanes() {
        return ((List<Airplane>) airplaneRepository.findAll())
                .stream()
                .map(AirplaneDTO::toDTO)
                .collect(Collectors.toList());
    }

    public AirplaneDTO getAirplaneById(Long id) {
        Airplane airplane = airplaneRepository.findById(id);
        return AirplaneDTO.toDTO(airplane);
    }

    public AirplaneDTO saveAirplane(AirplaneDTO airplaneDTO) {
        Airplane airplane = AirplaneDTO.toEntity(airplaneDTO);
        airplaneRepository.save(airplane);
        return AirplaneDTO.toDTO(airplane);
    }

    public AirplaneDTO updateAirplane(AirplaneDTO airplaneDTO) {
        Airplane airplane = AirplaneDTO.toEntity(airplaneDTO);
        Airplane savedAirplane = airplaneRepository.update(airplane);
        return AirplaneDTO.toDTO(savedAirplane);
    }

    public void deleteAirplaneById(Long id) {
        airplaneRepository.deleteById(id);
    }
    public void deleteAirplane(AirplaneDTO airplaneDTO) {
        airplaneRepository.delete(AirplaneDTO.toEntity(airplaneDTO));
    }
}
