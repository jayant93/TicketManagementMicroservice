/**
 * 
 */
package exila.user.management.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author jayantkumar
 *
 */
@Entity
public class ExileUser {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	private Integer age;
	
	private Character sex;// M or F
	
	private String phoneNumber;
	
	private String email;
	
	private Long otp;
	
	//This will be false by default unless user
	//changes the password using otp
	private Boolean firstLogin = false;
	

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="name_id")
    private UserName name;
    
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="address_id")
    private UserAddress address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getOtp() {
		return otp;
	}

	public void setOtp(Long otp) {
		this.otp = otp;
	}

	public Boolean getFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(Boolean firstLogin) {
		this.firstLogin = firstLogin;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public UserName getName() {
		return name;
	}

	public void setName(UserName name) {
		this.name = name;
	}

	public UserAddress getAddress() {
		return address;
	}

	public void setAddress(UserAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ExileUser [userId=" + userId + ", age=" + age + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", name=" + name + ", address=" + address + "]";
	}
    
    
	
	
}