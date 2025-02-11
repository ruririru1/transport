package com.example.transport.transport.model;

import jakarta.persistence.*;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String registrationNumber;
    private int capacity;

    public Bus() {}

    public Bus(String model, String registrationNumber, int capacity) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

