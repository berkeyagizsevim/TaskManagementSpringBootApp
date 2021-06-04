package sen3004.taskmanagement.model;

import java.time.LocalDate;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	
	private int id;
	
	@NotEmpty
	private String fullName; 
	
	@NotEmpty
	private String email; 
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String phoneNumber; 
	
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
		

}
