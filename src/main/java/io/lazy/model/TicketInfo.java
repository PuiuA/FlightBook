package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Random;

@Entity
@Table(name="ticket")
@Getter
@AllArgsConstructor
@ToString
public class TicketInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ticketId;

    @Column(name="seat_number")
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name="class_type_id", nullable = false)
    ClassType classType;

    @ManyToOne
    @JoinColumn(name="status_id", nullable = false)
    Status status;

    @OneToOne
    @JoinColumn(name="client_id")
    Client client;

    @ManyToOne
    @JoinColumn(name="zbor_id")
    Zbor zbor;

    static String[] classTypes = {"Economy", "Business", "First"};
    static String[] statusEx = {"Confirmed", "Cancelled", "Checked-in"};

    public TicketInfo() {
        Random random = new Random();
        this.ticketId = Integer.parseInt("TKT" + (1000 + random.nextInt(9000)));
        this.seatNumber = (1 + random.nextInt(50)) + "" + (char) ('A' + random.nextInt(6));
        this.classType = new ClassType();
        this.status = new Status();
        this.client = new Client();
        this.zbor = new Zbor();
    }


    public void setTicketId(int ticketId) {
        if (ticketId != 0) {
            this.ticketId = ticketId;
        } else {
            throw new IllegalArgumentException("Invalid ticket ID. Must start with 'TKT' followed by 4 digits.");
        }
    }

    public void setSeatNumber(String seatNumber) {
        if (seatNumber != null && seatNumber.matches("\\d{1,2}[A-F]")) {
            this.seatNumber = seatNumber;
        } else {
            throw new IllegalArgumentException("Invalid seat number. Must be a number followed by a letter (A-F).");
        }
    }

    public void setClassType(ClassType classType) {
        if (classType != null) {
            this.classType = classType;
        } else {
            throw new IllegalArgumentException("Invalid class type. Must be one of: Economy, Business, First.");
        }
    }

    public void setStatus(Status status) {
        if (status != null) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Must be one of: Confirmed, Cancelled, Checked-in.");
        }
    }

    public void setClient(Client client) {
        if (client != null) {
            this.client = client;
        } else {
            throw new IllegalArgumentException("Invalid client type.");
        }
    }

    public void setZbor(Zbor zbor) {
        if (zbor != null) {
            this.zbor = zbor;
        }else {
            throw new IllegalArgumentException("Invalid zbor type.");
        }
    }

}
