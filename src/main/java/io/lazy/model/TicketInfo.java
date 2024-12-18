package io.lazy.model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Random;
@Entity
@Table(name="ticket")
public class TicketInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ticketId;

    @Column(name="seat_number")
    private String seatNumber;

    @Column(name = "class_type")
    private String classType;

    @Column(name = "status")
    private String status;

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
        this.classType = classTypes[random.nextInt(classTypes.length)];
        this.status = statusEx[random.nextInt(statusEx.length)];
    }

    public TicketInfo(int ticketId, String seatNumber, String classType, String status) {
        setTicketId(ticketId);
        setSeatNumber(seatNumber);
        setClassType(classType);
        setStatus(status);
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getClassType() {
        return classType;
    }

    public String getStatus() {
        return status;
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

    public void setClassType(String classType) {
        if (classType != null && Arrays.asList(classTypes).contains(classType)) {
            this.classType = classType;
        } else {
            throw new IllegalArgumentException("Invalid class type. Must be one of: Economy, Business, First.");
        }
    }

    public void setStatus(String status) {
        if (status != null && Arrays.asList(statusEx).contains(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Must be one of: Confirmed, Cancelled, Checked-in.");
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", classType='" + classType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
