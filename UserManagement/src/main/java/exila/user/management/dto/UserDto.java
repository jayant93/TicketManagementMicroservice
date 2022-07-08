package exila.user.management.dto;

/**
 * This object will be visible to client for providing user infromation to the
 * server
 * 
 * @author jayantkumar
 *
 */
public class UserDto {

	private Integer age;

	private Character sex;// M or F

	private String phoneNumber;

	private String email;
	
	private UserName name;
	
	private UserAddress address;

	public UserAddress getAddress() {
		return address;
	}

	public void setAddress(UserAddress address) {
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

	public UserName getName() {
		return name;
	}

	public void setName(UserName name) {
		this.name = name;
	}
	
	

}
