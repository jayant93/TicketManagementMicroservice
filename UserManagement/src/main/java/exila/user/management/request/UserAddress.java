package exila.user.management.request;

import javax.validation.constraints.NotBlank;

public class UserAddress {
	
	@NotBlank(message = "Street is mandatory")
	private String street;
	
	@NotBlank(message = "Building Number is mandatory")
	private String buildingNumber;
	
	@NotBlank(message = "City is mandatory")
	private String city;
	
	@NotBlank(message = "State is mandatory")
	private String state;
	
	@NotBlank(message = "Country is mandatory")
	private String country;
	
	@NotBlank(message = "Pincode is mandatory")
	private String pincode;
	
	@NotBlank(message = "LandMark is mandatory")
	private String landmark;
	
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
	
	

}
