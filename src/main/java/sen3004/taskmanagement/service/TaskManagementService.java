package sen3004.taskmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import sen3004.taskmanagement.dao.TaskManagementTaskRepository;
import sen3004.taskmanagement.dao.TaskManagementUserRepository;
import sen3004.taskmanagement.model.Task;
import sen3004.taskmanagement.model.User;

@Service
@Transactional
public class TaskManagementService {

	@Autowired
	TaskManagementUserRepository userrepository;

	@Autowired
	TaskManagementTaskRepository taskrepository;
	
	
	public User findUserById(long id) {
		return userrepository.getOne(id);
	}
	
	public List<User> findUserByName(String name) {
		return null;
	}

	public Task findTaskById(long id) {
		return taskrepository.getOne(id);
	}
	
	public void saveTask(Task task) {
		taskrepository.save(task);

	}
	
	public void saveUser(User user) {
		userrepository.save(user);
	}
	
	
	

	
	
}
