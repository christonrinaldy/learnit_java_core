package com.itbulls.learnit.javacore.finaltask.storage;

import java.util.List;

import com.itbulls.learnit.javacore.finaltask.enteties.User;

public interface UserStoringService {
	
	void storeUser(User user);
	
	List<User> loadUsers();
	
}
