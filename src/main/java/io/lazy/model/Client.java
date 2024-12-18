package io.lazy.model;

import jakarta.persistence.*;

@Entity
@Table(name="client")
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

    public Client(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public int getAge(){ return age;}

    public void setFirstName(String newFirstName){ this.firstName = newFirstName;}
    public void setLastName(String newLastName){ this.lastName = newLastName; }
    public void setAge(int newAge){if (newAge>0 && newAge<110){ this.age = newAge; } }
}