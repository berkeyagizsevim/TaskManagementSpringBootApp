package sen3004.taskmanagement.validator;



import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sen3004.taskmanagement.model.SampleObject;

import org.springframework.stereotype.Component;





@Component
public class FieldMatchValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return SampleObject.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		SampleObject so = (SampleObject)target;
		
		if(so.getTextField1().equals(so.getNumericField2()) == false){
			errors.rejectValue("textField3","my.custom.err");
		}
		
	}



}
