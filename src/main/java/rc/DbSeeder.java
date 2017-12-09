package rc;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

	public DbSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}



	private HotelRepository hotelRepository;
	
	
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Hotel marriot = new Hotel("Marriot",138,new Address("Paris","France"),
				Arrays.asList(
						new Review("John",8, false),
						new Review("tracy",7, true)
							));
	
		Hotel Ibis = new Hotel("Ibis",130,new Address("Mumbai","India"),
				Arrays.asList(
						new Review("sand",5, false),
						new Review("arfat",4, true)
							));
		
		Hotel trident = new Hotel("trident",134,new Address("Toronto","Canada"),
				Arrays.asList(
						new Review("Apoorva",6, false),
						new Review("Vikram",7, true)
							));
	
	
	

	//deop existing db
	this.hotelRepository.deleteAll();
	
	// add our hotels to the database
	
	List<Hotel> hotels = Arrays.asList(marriot,Ibis,trident);
	this.hotelRepository.save(hotels);
	
	}
}
