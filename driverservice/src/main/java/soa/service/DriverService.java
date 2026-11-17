package soa.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import soa.model.Driver;

@Service
public class DriverService {

    public Object getAllDrivers() {

        List<Driver> drivers = Arrays.asList(
            new Driver(1, "Ravi", "Car"),
            new Driver(2, "Kiran", "Bike"),
            new Driver(3, "Arjun", "Auto")
        );

        return drivers;
    }
}