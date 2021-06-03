package sen3004.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sen3004.taskmanagement.model.SampleObject;

@Controller
public class TaskManagementController {

	@RequestMapping(value = { "/display-form", "form.html" }, method = RequestMethod.GET)
	public ModelAndView displayForm() {
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("formData", new SampleObject());

		return mv;
	}
	
	// After submission, we need to control fields.

	@RequestMapping(value = "/send-form-data", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("formData") SampleObject formData, BindingResult result) {
		ModelAndView mv = new ModelAndView("form-result");
		mv.addObject("formData", formData);
		
		if(result.hasErrors()) {
			mv.setViewName("form");
		}else {
			mv.setViewName("form-result");
		}

		return mv;
	}

}
