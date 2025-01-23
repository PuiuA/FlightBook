package io.lazy.services;

import io.lazy.dto.AirportDTO;
import io.lazy.mapper.AirportMapper;
import io.lazy.model.Airport;
import io.lazy.model.Client;
import io.lazy.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AirportService {
    private final AirportRepository airportRepository;
    private final AirportMapper airportMapper;

    public List<AirportDTO> getAllAirports(){
        return ((List<Airport>) airportRepository.findAll())
                .stream()
                .map(airportMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AirportDTO getAirportById(Long id){
        return airportMapper.toDTO(airportRepository.findById(id));
    }

    public AirportDTO saveAirport(AirportDTO airportDTO){
        Airport airport = airportMapper.toEntity(airportDTO);
        airportRepository.save(airport);
        return airportMapper.toDTO(airport);
    }

    public AirportDTO updateAirport(Long id, AirportDTO airportDTO){
        Airport airport = airportRepository.findById(id);
        Airport updatedAirport = airportMapper.toEntity(airportDTO);
        return airportMapper.toDTO(airportRepository.save(updatedAirport));
    }

    public void deleteAirport(AirportDTO airportDTO){
        airportRepository.delete(airportMapper.toEntity(airportDTO));
    }

    public void deleteAirportById(Long id){
        airportRepository.deleteById(id);
    }
}
