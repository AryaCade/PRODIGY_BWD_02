package com.InfoTeck.User_02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InfoTeck.User_02.User.User;
import com.InfoTeck.User_02.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public List<User> getAllUsers()
	{
		return repository.findAll();
	}
	
	public Optional<User> getUserById(String id)
	{
		return repository.findById(id);
	}
	
	public User createUserById(User user)
	{
		return repository.save(user);
	}
	
    public Optional<User> updateUserById(String id, User updatedUser) 
    {
        return repository.findById(id).map(existingUser -> {
            updatedUser.setId(id);
            
            return repository.save(updatedUser);
    });
	
    }
    
    public boolean deleteUser(String id)
    {
    	
		return repository.findById(id).map(user -> {
			
			repository.deleteById(id);
			return true;
		}).orElse(false);
    }
}
