package exila.user.management.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import exila.user.management.model.User;


public interface UserRespository extends JpaRepository<User,Long>{

	
	
}
