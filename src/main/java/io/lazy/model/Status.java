package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

}
