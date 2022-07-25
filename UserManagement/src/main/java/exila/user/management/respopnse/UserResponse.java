package exila.user.management.respopnse;

import java.util.List;

public class UserResponse {
	
	private Long userId;

	private Integer age;

	private Character sex;// M or F

	private String phoneNumber;

	private String email;
	
	private UserName name;
	
	
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

//	private List<UserAddress> address;
//
//	public List<UserAddress> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<UserAddress> address) {
//		this.address = address;
//	}

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
