package io.lazy.services;

import io.lazy.dto.SeatNumberDTO;
import io.lazy.model.SeatNumber;
import io.lazy.repository.SeatNumberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SeatNumberService {
    private final SeatNumberRepository seatNumberRepository;

    public List<SeatNumberDTO> getAllSeatNumbers() {
        return ((List<SeatNumber>) seatNumberRepository.findAll())
                .stream()
                .map(SeatNumberDTO::toDTO)
                .collect(Collectors.toList());
    }

    public SeatNumberDTO getSeatNumberById(Long id) {
        return SeatNumberDTO.toDTO(seatNumberRepository.findById(id));
    }

    public SeatNumberDTO saveSeatNumber(SeatNumberDTO seatNumberDTO) {
        return SeatNumberDTO.toDTO(seatNumberRepository.save(SeatNumberDTO.toEntity(seatNumberDTO)));
    }

    public SeatNumberDTO updateSeatNumber(SeatNumberDTO seatNumberDTO) {
        return SeatNumberDTO.toDTO(seatNumberRepository.save(SeatNumberDTO.toEntity(seatNumberDTO)));
    }

    public void deleteSeatNumberById(Long id) {
        seatNumberRepository.deleteById(id);
    }
    public void deleteSeatNumber(SeatNumberDTO seatNumberDTO) {
        seatNumberRepository.delete(SeatNumberDTO.toEntity(seatNumberDTO));
    }
}
