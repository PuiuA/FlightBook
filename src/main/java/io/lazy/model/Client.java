package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="client")
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="age")
    private int age;

    static String[] numeS = {"Ana","Maria","Ion","Vasile","Mirela","Nicolae","Maxim","Madalina","Ioana"};
    static String[] prenum = {"A","M","I","V","J","N","P","B","C"};

    // Constructor implicit necesar pentru Hibernate
    public Client() {}

}