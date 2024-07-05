package com.ManagePro.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ManagePro.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT * FROM user WHERE user_name LIKE %:username%", nativeQuery = true)
	List<User> getUserByUserName(@Param("username") String username);

}
