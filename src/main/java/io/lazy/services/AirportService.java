package io.lazy.services;

import io.lazy.dto.AirportDTO;
import io.lazy.model.Airport;
import io.lazy.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AirportService {
    private final AirportRepository airportRepository;


    public List<AirportDTO> getAllAirports(){
        return ((List<Airport>) airportRepository.findAll())
                .stream()
                .map(AirportDTO::toDTO)
                .collect(Collectors.toList());
    }

    public AirportDTO getAirportById(Long id){
        return AirportDTO.toDTO(airportRepository.findById(id));
    }

    public AirportDTO saveAirport(AirportDTO airportDTO){
        Airport airport = AirportDTO.toEntity(airportDTO);
        airportRepository.save(airport);
        return AirportDTO.toDTO(airport);
    }

    public AirportDTO updateAirport(Long id, AirportDTO airportDTO){
        Airport airport = airportRepository.findById(id);
        Airport updatedAirport = AirportDTO.toEntity(airportDTO);
        return AirportDTO.toDTO(airportRepository.save(updatedAirport));
    }

    public void deleteAirport(AirportDTO airportDTO){
        airportRepository.delete(AirportDTO.toEntity(airportDTO));
    }

    public void deleteAirportById(Long id){
        airportRepository.deleteById(id);
    }
}
