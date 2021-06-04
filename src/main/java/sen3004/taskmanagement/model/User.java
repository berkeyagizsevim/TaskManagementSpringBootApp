package sen3004.taskmanagement.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.*;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;



@Entity
@Table(name="user")
public class User  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Column(name="fullname")
	private String fullName; 
	
	@NotEmpty
	@Column(name="email")
	private String email; 
	
	@NotEmpty
	@Column(name="password")
	private String password;
	
	/*@NotEmpty
	private String confirmPassword;
	*/
	
	@NotEmpty
	@Column(name="phonenumber")
	private String phoneNumber; 
	
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="dateofbirth")
	private LocalDate dateOfBirth;	
	
	@ManyToMany
	@JoinTable(name = "assignedtasks", 
					joinColumns = @JoinColumn(name = "uid"), 
					inverseJoinColumns = @JoinColumn(name="tid"))
	@OrderBy(value ="id")
	private Set<Task> tasks = new HashSet<>();
	
	
	
	
	/*public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}*/
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
		

}
