package oracle.academy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import oracle.academy.model.Role;
import oracle.academy.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
	
	//Fill users to DB
		User user1 = new User();
		user1.setFirstName("Ievgen");
		user1.setLastName("Firtsov");
		user1.setAge(7);
		user1.setEmail("asd@ggg");
		user1.setRole(Role.SUPER_ADMIN);
		userDao.create(user1);
		
		User user2 = new User();
		user2.setFirstName("Gekka");
		user2.setLastName("Lugovko");
		user2.setAge(17);
		user2.setEmail("asd@fff");
		user2.setRole(Role.ADMIN);
		userDao.create(user2);
		
		User user3 = new User();
		user3.setFirstName("Senya");
		user3.setLastName("Obama");
		user3.setAge(73);
		user3.setEmail("asd@lll");
		user3.setRole(Role.USER);
		userDao.create(user3);
		
		return "redirect:/users";
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView viewAllUsers() {
		ModelAndView modelAndView = new ModelAndView("userList");
		List<User> users = userDao.getAll();
		users = userDao.getAll();
		System.out.println(users.size());
		modelAndView.addObject("users", users);
		return modelAndView;
	}
	

}







