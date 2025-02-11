package com.example.transport.transport.controller;

import com.example.transport.transport.model.Passenger;
import com.example.transport.transport.service.PassengerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerService.savePassenger(passenger);
    }
}
