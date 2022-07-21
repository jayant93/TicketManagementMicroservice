package exila.user.management.restController;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exila.user.management.dto.CreatePasswordDto;
import exila.user.management.dto.UserDto;
import exila.user.management.request.CreatePasswordRequest;
import exila.user.management.request.UserRequest;
import exila.user.management.respopnse.UserResponse;
import exila.user.management.service.UserManagement;

@RestController("/user")
public class UserController {
	
	@Autowired
	ModelMapper mapper;

	@Autowired
	UserManagement service;
	
	@PostMapping("/create")
	public UserResponse createUser(@Valid @RequestBody UserRequest request) {
		
		
		UserDto dto = mapper.map(request,UserDto.class);
		
		UserResponse response = service.createUser(dto);
		
		return response;
		
	}
	
	@PostMapping("/create/password")
	public Boolean createPasswordUsingOtp(@Valid @RequestBody CreatePasswordRequest request) {
		
		
		CreatePasswordDto dto = mapper.map(request, CreatePasswordDto.class);
		

		return true;
	}
	
	
	
	
}
