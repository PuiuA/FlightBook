package io.lazy.model;

import io.lazy.dto.FlightStatusDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="client", schema = "flight_book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    @Column(name="age")
    private Integer age;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "status", nullable = false)
    private FlightStatus flightStatus;

    static String[] numeS = {"Ana","Maria","Ion","Vasile","Mirela","Nicolae","Maxim","Madalina","Ioana"};
    static String[] prenum = {"A","M","I","V","J","N","P","B","C"};


//
//    Client(ClientBuilder builder) {
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.age = builder.age;
//    }
//
//    public static class ClientBuilder{
//        String firstName;
//        String lastName;
//        Integer age;
//
//        public ClientBuilder setFirstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//        public ClientBuilder setLastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//        public ClientBuilder setAge(Integer age) {
//            this.age = age;
//            return this;
//        }
//        public Client build() {
//            return new Client(this);
//        }
//    }
}