package com.example.transport.transport.model;

import jakarta.persistence.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    public Passenger() {}

    public Passenger(String name, int age, Bus bus) {
        this.name = name;
        this.age = age;
        this.bus = bus;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Bus getBus() {
        return bus;
    }
}

