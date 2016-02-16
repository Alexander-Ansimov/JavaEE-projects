package oracle.academy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import oracle.academy.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("userList");
		User user1 = new User();
		user1.setFirstName("Ievgen");
		User user2 = new User();
		user1.setFirstName("Fuusya");
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		modelAndView.addObject("users", users);
		return modelAndView;
	}

}
