package model;

import java.util.HashMap;
import java.util.Map;

public class UserMgmt {
	
	private Map<String, User> users = new HashMap<String, User>();
	
	public void createUser(String key, User u){
		users.put(key, u);
	}
	
	public User findUser(String key){
		return users.get(key);
	}
	
}
