package com.mybatisSIUD;

import java.util.List;


public interface myIUser {

	public User getUser(int id);
	
	public List<User> getUserList();
	
	public void insertUser(User user);
	

    public void updateUser(User user);

    public void deleteUser(int id);
}
