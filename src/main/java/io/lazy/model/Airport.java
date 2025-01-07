package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="airport")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer id;

    @Column(name="name", nullable=false)
    public String name;

    @Column(name="city", nullable=false)
    public String city;

    @Column(name="country", nullable=false)
    public String country;

}
