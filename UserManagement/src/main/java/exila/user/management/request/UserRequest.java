package exila.user.management.request;

import java.util.ArrayList;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * This object will be visible to client for providing user infromation to the
 * server
 * 
 * @author jayantkumar
 *
 */
public class UserRequest {

	@NotBlank(message = "First Name is mandatory")
	private String firstName;
	
	private String middleName;
	
	@NotBlank(message = "Last Name is mandatory")
	private String lastName;

	//@NotBlank(message = "Age is mandatory")
	private Integer age;

	//@NotBlank(message = "Sex is mandatory")
	private Character sex;// M or F

	@NotBlank(message = "Phone Number is mandatory")
	private String phoneNumber;

	@NotBlank(message = "Email is mandatory")
	@Email
	private String email;

	private ArrayList<UserAddress> address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public ArrayList<UserAddress> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<UserAddress> address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
