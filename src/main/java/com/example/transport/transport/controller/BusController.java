package com.example.transport.transport.controller;


import com.example.transport.transport.model.Bus;
import com.example.transport.transport.service.BusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @PostMapping
    public Bus createBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }


}

