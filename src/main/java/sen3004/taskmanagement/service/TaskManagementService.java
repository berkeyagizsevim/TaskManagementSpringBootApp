package sen3004.taskmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sen3004.taskmanagement.dao.TaskManagementRepository;
import sen3004.taskmanagement.model.User;
import sen3004.taskmanagement.service.IUser;


@Service
public class TaskManagementService implements IUser {

	@Autowired
	TaskManagementRepository repository;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		repository.create(user);
		
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}
	

}
