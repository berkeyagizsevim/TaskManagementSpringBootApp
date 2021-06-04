package sen3004.taskmanagement.model;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="task")

public class Task {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotEmpty
	@Column(name="tasktitle")
	private String taskTitle;
	
	@NotEmpty
	@Column(name="taskdescription")
	private String taskDescription; 
	
	@Column(name="taskstatus")
	private String taskStatus = "todo";
	
	@ManyToMany(mappedBy = "tasks")
	
	private Set<User> users = new HashSet<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	} 
	
	

}
