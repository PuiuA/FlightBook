package io.lazy;

import io.lazy.model.AirPlane;
import io.lazy.model.Client;
import io.lazy.model.PlaneCapacity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightBookerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightBookerApplication.class, args);
    }
}