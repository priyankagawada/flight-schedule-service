package com.training.boot.ms.service;

import java.util.List;
import com.training.boot.ms.model.Flight;

public interface FlightScheduleService {

	public List<Flight> getFlights(String from, String to);

}
