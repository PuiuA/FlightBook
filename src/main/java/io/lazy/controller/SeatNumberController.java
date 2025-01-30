package io.lazy.controller;

import io.lazy.dto.SeatNumberDTO;
import io.lazy.model.SeatNumber;
import io.lazy.services.SeatNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seat_numbers")
public class SeatNumberController {
    private final SeatNumberService seatNumberService;

    @GetMapping
    public List<SeatNumberDTO> getSeatNumbers() {
        return seatNumberService.getAllSeatNumbers();
    }
    @GetMapping("/{id}")
    public SeatNumberDTO getSeatNumberById(@PathVariable Long id) {
        return seatNumberService.getSeatNumberById(id);
    }
    @PostMapping
    public SeatNumberDTO saveSeatNumber(@RequestBody SeatNumberDTO seatNumberDTO) {
        return seatNumberService.saveSeatNumber(seatNumberDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteSeatNumberById(@PathVariable Long id) {
        seatNumberService.deleteSeatNumberById(id);
    }
    @DeleteMapping
    public void deleteSeatNumber(@RequestBody SeatNumberDTO seatNumberDTO) {
        seatNumberService.deleteSeatNumber(seatNumberDTO);
    }
}
