package sen3004.taskmanagement.service;

import java.util.List;

import sen3004.taskmanagement.model.User;

public interface IUser {
	public List<User> findAll();
	
	public User findById(int id);
	
	public void create(User user);
	
	public void delete(int id);
}
