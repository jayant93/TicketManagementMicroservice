package exila.user.management.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exila.user.management.config.EmailService;
import exila.user.management.dto.CreatePasswordDto;
import exila.user.management.dto.UserDto;
import exila.user.management.model.ExileUser;
import exila.user.management.repositories.UserRespository;
import exila.user.management.respopnse.UserResponse;
import exila.user.management.service.UserManagement;

/**
 * 
 * @author jayantkumar
 *
 */
@Service
public class UserManagementImpl implements UserManagement {

	@Autowired
	UserRespository repo;

	@Autowired
	ModelMapper mapper;
	
	@Autowired
	EmailService email;

	@Override
	public UserResponse createUser(UserDto dto) {

		ExileUser user = mapper.map(dto, ExileUser.class);

		// now generate op and send email

		Long otp = Math.abs(Math.round((Math.random() * (Integer.MAX_VALUE - Integer.MIN_VALUE)) + Integer.MIN_VALUE));

		user.setOtp(otp);

		user = repo.save(user);

		// now send email
		email.sendMessage(user.getEmail(), otp);

		UserResponse response = mapper.map(user, UserResponse.class);

		return response;
	}

	@Override
	public Boolean createPassword(CreatePasswordDto dto) {
		
		
		
		
		return null;
	}

}
