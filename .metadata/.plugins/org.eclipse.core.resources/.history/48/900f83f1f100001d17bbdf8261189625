package exila.user.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;

@Entity
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private String street;
	private String buildingNumber;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String landmark;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "UserAddress [street=" + street + ", buildingNumber=" + buildingNumber + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + ", landmark=" + landmark + "]";
	}
	
	
	
	
}
