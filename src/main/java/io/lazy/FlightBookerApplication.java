package io.lazy;

import io.lazy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightBookerApplication {
//    Client client = new Client.ClientBuilder().setFirstName("Sirbu").setLastName("Ana").build();
    public static void main(String[] args) {
        SpringApplication.run(FlightBookerApplication.class, args);
    }
}