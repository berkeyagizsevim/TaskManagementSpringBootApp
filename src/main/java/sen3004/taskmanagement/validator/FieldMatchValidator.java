package sen3004.taskmanagement.validator;



import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sen3004.taskmanagement.model.User;

import org.springframework.stereotype.Component;





@Component
public class FieldMatchValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User)target;
		
		/*if(user.getPassword().equals(user.getConfirmPassword()) == false){
			errors.rejectValue("confirmPassword","passwords.not.match");
		}*/
		
	}



}
