package exila.user.management.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import exila.user.management.model.User;


public interface UserRespository extends JpaRepository<User,Long>{

	@Query("Select distinct u from User u where u.email = :email")
	User findUserByEmail(@Param("email") String email);

	
	
}
