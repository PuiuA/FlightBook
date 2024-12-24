package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="class_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

}
