package com.example.transport.transport.repository;

import com.example.transport.transport.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

