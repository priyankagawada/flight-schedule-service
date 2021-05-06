package com.training.boot.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.boot.ms.model.Flight;

public interface FlightScheduleRepository extends JpaRepository<Flight, Long>{

}
