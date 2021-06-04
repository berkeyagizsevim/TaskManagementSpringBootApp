package sen3004.taskmanagement.model;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;


@Entity
@Table(name="task")

public class Task {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId; 
	
	@Column(name="tasktitle")
	private String taskTitle;
	
	@Column(name="taskdescription")
	private String taskDescription; 
	
	@Column(name="taskstatus")
	private String taskStatus;
	
	@ManyToMany(mappedBy = "tasks")
	
	private Set<User> users = new HashSet<>();
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
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
