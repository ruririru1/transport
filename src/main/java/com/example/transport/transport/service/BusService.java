package com.example.transport.transport.service;

import com.example.transport.transport.model.Bus;
import com.example.transport.transport.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }
}

