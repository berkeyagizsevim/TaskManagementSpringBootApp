package sen3004.taskmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sen3004.taskmanagement.model.Task;


@Repository
public interface TaskManagementTaskRepository extends JpaRepository<Task, Long>{
	

}
