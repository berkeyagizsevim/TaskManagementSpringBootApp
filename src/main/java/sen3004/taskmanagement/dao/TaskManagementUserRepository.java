package sen3004.taskmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sen3004.taskmanagement.model.User;

@Repository
public interface TaskManagementUserRepository extends JpaRepository<User, Long>{
	
	
}
