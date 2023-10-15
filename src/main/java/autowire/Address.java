package autowire;

public class Address {

	private String city;
	private String loaction;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setLoaction(String loaction) {
		
		this.loaction = loaction;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String loaction) {
		super();
		this.city = city;
		this.loaction = loaction;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", loaction=" + loaction + "]";
	}
	
	
}
