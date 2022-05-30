package com.rakuten.croptracking.DAOImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rakuten.croptracking.models.User;
import com.rakuten.croptracking.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=this.userRepository.findByUsername(username);
		if(user==null)
		{
			System.out.println("user not found");
			throw new UsernameNotFoundException("N user found");
		}
		
		
		return user;
	}

	
}
