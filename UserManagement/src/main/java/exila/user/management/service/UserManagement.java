package exila.user.management.service;

import exila.user.management.dto.CreatePasswordDto;
import exila.user.management.dto.UserDto;
import exila.user.management.exceptions.FalseOtpException;
import exila.user.management.exceptions.UserAlreadyExistException;
import exila.user.management.exceptions.UserNotFoundException;
import exila.user.management.model.User;
import exila.user.management.respopnse.UserResponse;

public interface UserManagement {

	UserResponse createUser(UserDto dto) throws UserAlreadyExistException;

	void createPassword(CreatePasswordDto dto) throws FalseOtpException;

	User getUserByUserId(Long userId) throws UserNotFoundException;

}
