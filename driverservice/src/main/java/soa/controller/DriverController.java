package soa.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.DriverService;

@RestController
@RequestMapping("/")
public class DriverController {

    DriverService DS;
    Environment environment;

    public DriverController(DriverService DS, Environment environment) {
        this.DS = DS;
        this.environment = environment;
    }

    @GetMapping("drivers")
    public Object drivers() {

        String port = environment.getProperty("local.server.port");

        System.out.println("Request received by Driver Service on port: " + port);

        return DS.getAllDrivers();
    }
}