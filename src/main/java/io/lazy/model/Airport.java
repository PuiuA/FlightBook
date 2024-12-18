package io.lazy.model;

import jakarta.persistence.*;

@Entity
@Table(name="airport")
public class Airport {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;

    @Column(name="name", nullable=false)
    public String name;

    @Column(name="city", nullable=false)
    public String city;

    @Column(name="country", nullable=false)
    public String country;

    public Airport() {}

    public Airport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getName() { return name; }

    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() { return name + " " + city + " " + country; }
}
