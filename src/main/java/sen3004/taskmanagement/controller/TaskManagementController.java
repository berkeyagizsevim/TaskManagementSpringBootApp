package sen3004.taskmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sen3004.taskmanagement.model.User;
import sen3004.taskmanagement.service.TaskManagementService;
import sen3004.taskmanagement.validator.FieldMatchValidator;



@Controller
public class TaskManagementController {
	
	//@Autowired
	//FieldMatchValidator fm; 
	
	@Autowired
	TaskManagementService service;

	@RequestMapping(value = { "/login", "login.html" }, method = RequestMethod.GET)
	public ModelAndView displayLoginPage() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("loginData", new User());

		return mv;
	}
	
	// After submission, we need to control login input fields.

	@RequestMapping(value = "/check-login", method = RequestMethod.POST)
	public ModelAndView processLoginForm(@Valid @ModelAttribute("loginData") User loginData, BindingResult result) {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("loginData", loginData);
		

		
		if(result.hasErrors()) {
			mv.setViewName("login");
		}else {
			
			// Check whether this data located on db or not? 
			mv.setViewName("welcome");
		}

		return mv;
	}
	
	// Send Sign Up Form
	
	@RequestMapping(value = { "/sign-up", "register.html" }, method = RequestMethod.GET)
	public ModelAndView displaySignUpPage() {
		ModelAndView mv = new ModelAndView("sign-up");
		mv.addObject("signupData", new User());
		

		return mv;
	}
	
	
	@RequestMapping(value = "/send-signup-form", method = RequestMethod.POST)
	public ModelAndView processSignUpForm(@Valid @ModelAttribute("signupData") User signupData, BindingResult result) {
		ModelAndView mv = new ModelAndView("sign-up");
		mv.addObject("signupData", signupData);
		
		if(result.hasErrors()) {
			mv.setViewName("sign-up");
		}else {
			mv.setViewName("welcome");
			service.saveUser(signupData);
			//mv.addObject("persons", service.findAll();)
			//user fills form, after validation we create instance of a project.
		}

		return mv;
	}
	


}
