package com.training.boot.ms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.training.boot.ms.dao.FlightScheduleRepository;
import com.training.boot.ms.model.Flight;

@Service("flightScheduleService")
public class FlightScheduleServiceImpl implements FlightScheduleService {

	@Autowired
	private FlightScheduleRepository repository;

	@Value("${airline.disabled}")
	private String airlineDisabled;
	
	@Override
	public List<Flight> getFlights(String from, String to) {

		Flight flight = new Flight();
		flight.setFlightFrom(from);
		flight.setFlightTo(to);

		Example<Flight> filterFlight = Example.of(flight);
		List<Flight> flightList = repository.findAll(filterFlight);
		
		if(!CollectionUtils.isEmpty(flightList)) {
			flightList = flightList.stream().filter(f -> !airlineDisabled.equals(f.getAirline()))
					.collect(Collectors.toList());
		}
		return flightList;
	}

}
