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

import sen3004.taskmanagement.model.Task;
import sen3004.taskmanagement.model.User;
import sen3004.taskmanagement.service.TaskManagementService;
import sen3004.taskmanagement.validator.FieldMatchValidator;



@Controller
public class TaskManagementController {
	
	@Autowired
	FieldMatchValidator fm; 
	
	@Autowired
	TaskManagementService service;

	@RequestMapping(value = {"/login", "login.html"}, method = RequestMethod.GET)
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
			
			mv.setViewName("welcome");
			
		}

		return mv;
	}
	
	//Show Sign Up Form
	
	@RequestMapping(value = { "/sign-up", "register.html" }, method = RequestMethod.GET)
	public ModelAndView displaySignUpPage() {
		ModelAndView mv = new ModelAndView("sign-up");
		mv.addObject("signupData", new User());
		

		return mv;
	}
	
	//Send Sign Up Form and Check Values
	
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
	
	
	//Show Add Task Form
	
		@RequestMapping(value = { "/add-new-task", "add-task.html" }, method = RequestMethod.GET)
		public ModelAndView displayAddTaskPage() {
			ModelAndView mv = new ModelAndView("add-task");
			mv.addObject("taskData", new Task());
			

			return mv;
		}
		
		//Send Sign Up Form and Check Values
		
		@RequestMapping(value = "/send-task-data", method = RequestMethod.POST)
		public ModelAndView processSignUpForm(@Valid @ModelAttribute("taskData") Task taskData, BindingResult result) {
			ModelAndView mv = new ModelAndView("add-task");
			mv.addObject("taskData", taskData);
			
			if(result.hasErrors()) {
				mv.setViewName("add-task");
			}else {
				mv.setViewName("task-added");
				service.saveTask(taskData);
			}

			return mv;
		}
	
	
	@RequestMapping(value = "/task/{tid}", method = RequestMethod.GET)
	public ModelAndView viewTask(@PathVariable long tid) {
		ModelAndView mv = new ModelAndView("view-task");
		mv.addObject("task", service.findTaskById(tid));
		
		return mv;
	}
	
	@RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
	public ModelAndView viewUser(@PathVariable long uid) {
		ModelAndView mv = new ModelAndView("view-user");
		mv.addObject("user", service.findUserById(uid));
		
		return mv;
	}
	
	@RequestMapping(value = "/user/{uid}/add-task/{tid}", method = RequestMethod.GET)
	public ModelAndView addTaskToUserAuthor(@PathVariable long uid, @PathVariable long tid) {
		ModelAndView mv = new ModelAndView("view-user");
		User u = service.findUserById(uid);
		Task t = service.findTaskById(tid);
		
		u.getTasks().add(t);
		service.saveUser(u);
		
		mv.addObject("user", u);
		
		return mv;
	}
	
	@RequestMapping(value = "/user/{uid}/del-task/{tid}", method = RequestMethod.GET)
	public ModelAndView deleteTaskFromUser(@PathVariable long uid, @PathVariable long tid) {
		ModelAndView mv = new ModelAndView("view-user");
		User u = service.findUserById(uid);
		Task t = service.findTaskById(tid);
		
		u.getTasks().remove(t);
		service.saveUser(u);
		
		mv.addObject("user", u);
		
		return mv;
	}
	
	@RequestMapping(value = "/get-user/{name}", method = RequestMethod.GET)
	public ModelAndView getUser(@PathVariable String fullName) {
		ModelAndView mv = new ModelAndView("get-user");
		mv.addObject("user", service.findUserByName(fullName));
		return mv;
	}

	
	


}
