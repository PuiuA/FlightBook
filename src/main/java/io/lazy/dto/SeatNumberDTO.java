package io.lazy.dto;

import io.lazy.model.SeatNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatNumberDTO {
    String seatCode;
    Boolean isAvailable;

    static public SeatNumberDTO toDTO(SeatNumber seatNumber) {
        SeatNumberDTO dto = new SeatNumberDTO();
        dto.setSeatCode(seatNumber.getSeatCode());
        dto.setIsAvailable(seatNumber.isAvailable());
        return dto;
    }

    static public SeatNumber toEntity(SeatNumberDTO seatNumberDTO) {
        SeatNumber seatNumber = new SeatNumber();
        seatNumber.setSeatCode(seatNumberDTO.getSeatCode());
        seatNumber.setAvailable(seatNumberDTO.getIsAvailable());
        return seatNumber;
    }

}
