package exila.user.management.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exila.user.management.config.EmailService;
import exila.user.management.dto.CreatePasswordDto;
import exila.user.management.dto.UserDto;
import exila.user.management.exceptions.FalseOtpException;
import exila.user.management.exceptions.UserAlreadyExistException;
import exila.user.management.exceptions.UserNotFoundException;
import exila.user.management.model.User;
import exila.user.management.repositories.UserRespository;
import exila.user.management.respopnse.UserResponse;
import exila.user.management.service.UserManagement;
import exila.user.management.utility.Utility;

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
	public UserResponse createUser(UserDto dto) throws UserAlreadyExistException {
		
		
		//check if user pre exist or not
		User tempUser = repo.findUserByEmail(dto.getEmail());
		
		if(tempUser!=null)
			throw new UserAlreadyExistException(Utility.USER_ALREADY_EXIST_WITH_EMAIL+dto.getEmail());

		User user = mapper.map(dto, User.class);
		

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
	public void createPassword(CreatePasswordDto dto) throws FalseOtpException {

		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		messageDigest.update(dto.getPassword().getBytes());

		String passwordHash = new String(messageDigest.digest());

		User user = repo.findUserByEmail(dto.getEmail());

		if (user.getOtp().equals(dto.getOtp())) {

			user.setPassword(passwordHash);
			repo.save(user);

		} else {
			// throw user defined exception for false otp
			throw new FalseOtpException(Utility.FALSE_OTP);
		}

	}

	@Override
	public User getUserByUserId(Long userId) throws UserNotFoundException {
		
		
		User user = repo.findById(userId).get();
		
		if(user == null)
			throw new UserNotFoundException(Utility.USER_NOT_FOUND_EXCEPTION+userId);
		
		return user;
		
	}

}
