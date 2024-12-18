package io.lazy.model;

import jakarta.persistence.*;

@Entity
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public Status(String newName) {
        this.name = newName;
    }

    public Status() {}

    public String getStatus() { return name; }
    public void setStatus(String newName) { this.name = newName; }
}
