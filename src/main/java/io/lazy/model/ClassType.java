package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="class_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClassType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

}
