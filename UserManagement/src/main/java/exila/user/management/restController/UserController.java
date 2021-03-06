package exila.user.management.restController;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exila.user.management.dto.CreatePasswordDto;
import exila.user.management.dto.UserDto;
import exila.user.management.model.User;
import exila.user.management.request.CreatePasswordRequest;
import exila.user.management.request.UserRequest;
import exila.user.management.respopnse.ExileResponse;
import exila.user.management.respopnse.UserResponse;
import exila.user.management.service.UserManagement;
import exila.user.management.utility.Utility;

@RestController("/user")
public class UserController {

	@Autowired
	ModelMapper mapper;

	@Autowired
	UserManagement service;

	//@CachePut(value = "users", key = "#user.userId")
	@PostMapping("/create")
	public ExileResponse createUser(@Valid @RequestBody UserRequest request) {

		UserResponse response = null;
		try {
			UserDto dto = mapper.map(request, UserDto.class);

			response = service.createUser(dto);

		} catch (Exception e) {
			return new ExileResponse(new String(e.getMessage()), HttpStatus.BAD_REQUEST);
		}
		return new ExileResponse(response, HttpStatus.OK);

	}

	@PostMapping("/create/password")
	public ExileResponse createPasswordUsingOtp(@Valid @RequestBody CreatePasswordRequest request) {

		CreatePasswordDto dto = mapper.map(request, CreatePasswordDto.class);

		try {
			service.createPassword(dto);

		} catch (Exception e) {
			System.err.println("Exception occured while creating password : " + e.getMessage());
			return new ExileResponse(new String(e.getMessage()), HttpStatus.BAD_REQUEST);
		}

		return new ExileResponse(new String(Utility.PASSWORD_CREATION_SUCCESSFULL), HttpStatus.OK);
	}

	
	//@Cacheable(value = "users", key = "#userId")
	@GetMapping("/{userId}")
	public ExileResponse getUserByUserId(@PathVariable Long userId) {

		User user = null;
		try {
			user = service.getUserByUserId(userId);
		} catch (Exception e) {
			return new ExileResponse(new String(e.getMessage()), HttpStatus.BAD_REQUEST);
		}

		return new ExileResponse(user, HttpStatus.OK);
	}

}
