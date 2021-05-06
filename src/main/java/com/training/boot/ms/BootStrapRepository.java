package com.training.boot.ms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.boot.ms.dao.FlightScheduleRepository;
import com.training.boot.ms.model.Flight;

@Component
public class BootStrapRepository implements CommandLineRunner{

	
	private final FlightScheduleRepository repository;
	
	
	public BootStrapRepository(FlightScheduleRepository repository) {
		super();
		this.repository = repository;
	}



	@Override
	public void run(String... args) throws Exception {
		Flight flight1 = new Flight(1L, "UL-191", "DEL", "TYO", "Srilankan Airlines", "05:10", "07:35" );
		Flight flight2 = new Flight(2L, "UL-192", "DEL", "TYO", "China Southerlines Airlines", "06:10", "08:35" );
		Flight flight3 = new Flight(3L, "UL-193", "DEL", "TYO", "China Southerlines Airlines", "12:30", "14:35" );
		Flight flight4 = new Flight(4L, "UL-194", "DEL", "TYO", "Srilankan Airlines", "15:10", "18:40" );
	
	    repository.save(flight1);
	    repository.save(flight2);
	    repository.save(flight3);
	    repository.save(flight4);
	    
	
	}

	
	
	
}
