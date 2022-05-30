package com.rakuten.croptracking.DAOImpl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.croptracking.DAO.UserService;
import com.rakuten.croptracking.Exception.UserFoundException;
import com.rakuten.croptracking.models.User;
import com.rakuten.croptracking.models.UserRole;
import com.rakuten.croptracking.repository.RoleRepository;
import com.rakuten.croptracking.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		
		User local= this.userRepository.findByUsername(user.getUsername());
	    if (local!=null)
	    {
	    	System.out.println("User is already there");
    	throw new UserFoundException();
	    }else
	    {
	    	for(UserRole ur: userRoles)
	    	{
	    		roleRepository.save(ur.getRole());
	    	}
	    	user.getUserRoles().addAll(userRoles);
	    	local=this.userRepository.save(user);
	    }
		
		return local;
	}


	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}


	@Override
	public User getUser(String username) {
		
		return this.userRepository.findByUsername(username);
	}


	@Override
	public User updateUser(User user) {
		
		return this.userRepository.save(user);
	}


	@Override
	public Set<User> getUser() {
		
		return new LinkedHashSet<>( this.userRepository.findAll());
	}

	@Override
	public List<User> findAll() {
		
		return this.userRepository.findAll();
	}

}