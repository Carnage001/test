package com.rakuten.croptracking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rakuten.croptracking.models.User;

public interface UserRepository extends JpaRepository<User, Long>{



	public User findByUsername(String username);

	 @Query("SELECT u FROM User u WHERE u.username = :username")
	    public User getUserByUsername(@Param("username") String username);

	public User save(String username);

}