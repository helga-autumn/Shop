package com.service;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.repository.UserRepository;

@Service("userDetailsService")



public class userDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Transactional
	public UserDetails loadUserByUsername(String login)
	throws UsernameNotFoundException{
		com.entity.User user = userRepository.findOneByEmailOrName(login);
		if (user==null){
			return null;
			
		}
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
		return new User (String.valueOf(user.geteMail()),  String.valueOf(user.getPassword()),  authorities);
	
}
}
