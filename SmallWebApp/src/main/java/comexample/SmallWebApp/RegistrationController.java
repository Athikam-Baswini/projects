package comexample.SmallWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class RegistrationController {

	
	@RequestMapping("/regform")
	public String register() {
		return "registration";
	}
	@RequestMapping("/userDetail")
	public ModelAndView userInfo(UserRegistration reg) {
		ModelMap model = new ModelMap();
		model.addAttribute("name", reg.getUName());
		model.addAttribute("email", reg.getEmailId());
		model.addAttribute("gender", reg.getGender()==Integer.parseInt("1") ? "Male" : "Female");
		model.addAttribute("hobbies", reg.getHobby());
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj" ,model);
		return mv;
	}
}
