package com.rakuten.croptracking.DAO;

import java.util.List;
import java.util.Set;

import com.rakuten.croptracking.models.User;
import com.rakuten.croptracking.models.UserRole;

public interface UserService {
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	public void deleteUser(Long userId);

	public User getUser(String username);
	
	public User updateUser(User user);
	
	public Set<User> getUser();

	public List<User> findAll();


}
