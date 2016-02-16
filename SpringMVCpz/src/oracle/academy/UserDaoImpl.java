package oracle.academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
		usersCounter = 0L;
	}

	@Override
	public User create(User user) {
		Long id = ++usersCounter;
		user.setId(id);
		usersMap.put(id, user);
		return user;
	}

	@Override
	public User getById(Long id) {
		User user = usersMap.get(id);
		return user;
	}

	@Override
	public boolean delete(User user) {
		usersMap.remove(user.getId());
		System.out.println(usersMap.containsKey(user.getId()));
		return usersMap.containsKey(user.getId());
	}

	@Override
	public User update(User user) {
		usersMap.put(user.getId(), user);
		return usersMap.get(user.getId());
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		Iterator<Map.Entry<Long, User>> iterator = usersMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			users.add(entry.getValue());
		}			
		return users;
	}

}
