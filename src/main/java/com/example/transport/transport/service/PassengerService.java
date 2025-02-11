package com.example.transport.transport.service;

import com.example.transport.transport.model.Passenger;
import com.example.transport.transport.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}

