package oracle.academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import oracle.academy.model.User;


@Service
public class UserDaoImpl implements UserDao {
	
	private static Map<Long, User> usersMap;
	private static Long usersCounter;
	
	static {
		usersMap = new HashMap<>();
		usersCounter = 1L;
	}

	@Override
	public User create(User user) {
		Long id = usersCounter++;
		user.setId(id);
		usersMap.put(id, user);
		System.out.println(user.getFirstName() + id + "oooo");
		return user;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < usersMap.size(); i++) {
			users.add(usersMap.get(i));
			//System.out.println(usersMap.get(i).getFirstName()+" - "+i);
		}		
		return users;
	}

}
