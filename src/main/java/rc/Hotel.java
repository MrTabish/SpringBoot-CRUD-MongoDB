package rc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Hotels")
public class Hotel {
	@Id
	private String id;
	private String name;
	@Indexed(direction = IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address address;
	private List <Review> review;
	
	protected Hotel() {
		this.review = new ArrayList<>(); 
	}
	public Hotel(String name, int pricePerNight, Address address, List<Review> review) {
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.review = review;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public List<Review> getReview() {
		return review;
	}
	
	
	
	
	
}
