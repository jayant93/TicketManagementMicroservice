package exila.user.management.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import exila.user.management.model.ExileUser;


public interface UserRespository extends JpaRepository<ExileUser,Long>{

	
	
}
