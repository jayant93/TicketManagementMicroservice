package exila.user.management.request;

import javax.validation.constraints.NotBlank;

public class CreatePasswordRequest {
	
	@NotBlank(message = "Email is mandatory")
	String email;
	
	//@NotBlank(message = "Otp is mandatory")
	Long otp;
	
	@NotBlank(message = "Password is mandatory")
	String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
