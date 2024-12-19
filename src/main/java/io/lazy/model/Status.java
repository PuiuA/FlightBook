package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

}
