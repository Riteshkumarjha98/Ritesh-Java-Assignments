package com.contest.services;


import java.util.List;


import com.contest.exception.NotFoundException;
import com.contest.model.User;

public interface UserService {

	public User createUser(User User) throws NotFoundException;
	
	public User findUserById(Integer id) throws NotFoundException;
	
	public User getUsersById(Integer id) throws NotFoundException;
	
	public List<User> getAllUsersDetails() throws NotFoundException;
	
	public User BlockUser(Integer id)  throws NotFoundException;

	public List<User> findByEMAIL(String user_email);

	public User findByUsernamePassword(String username, String password);

	public void save(User user);
	
}
