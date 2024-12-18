package io.lazy.model;

import jakarta.persistence.*;

@Entity
@Table(name="class_type")
public class ClassType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public ClassType() {}
    public ClassType(String name) { this.name = name;}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
