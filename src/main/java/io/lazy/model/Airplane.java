package io.lazy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;

@Entity
@Table(name="plane", schema = "flight_book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    @Enumerated(EnumType.STRING)
    private AirplaneCapacity planeCapacity;
    @Column(name="total_seats")
    private Integer totalSeats;


    @Transient
    public LinkedHashSet<String> seats;

    public Airplane(String model, AirplaneCapacity capacity) {
        this.model = model;
        this.planeCapacity = capacity;
        seats = new LinkedHashSet<>(planeCapacity.getCapacity());
        this.generateSeats();
        this.printSeats();
    }

    private void generateSeats() {
        for (int i = 1; i < planeCapacity.getCapacity()+1; i++) {
            if(i< planeCapacity.getFirstClassRows()){
                seats.add(i + Litera.A.name());
                seats.add(i + Litera.B.name());
                seats.add(i + Litera.E.name());
                seats.add(i + Litera.F.name());
            }
            if (i < planeCapacity.getBussinesClassRows()+ planeCapacity.getFirstClassRows()){
                for (Litera litera : Litera.values()) {
                    seats.add(i + litera.name());
                }
            }
            if( i < planeCapacity.getCapacity()){
                for (Litera litera : Litera.values()) {
                    seats.add(i + litera.name());
                }
            }
        }
    }

    public void printSeats() {
        for (String l : seats){
            System.out.print(l+" ");
        }
    }
}
