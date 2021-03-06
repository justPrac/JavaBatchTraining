package com.java.dao;

import java.util.Set;

import com.java.model.User;

public interface UserDao
{
	public User getUser(String username);
	
	public Set<User> getAllUsers();
	
	public boolean addUser(User u);
	
	public boolean deleteUser(String username);
	
	public boolean updateUser(User u, String username);
	
	public boolean addFriend(String user_username, User friend);
	
	public boolean removeFriend(String user_username, String friend_username);
	
	public boolean removeAllFriends(String username);
	
	public Set<User> getAllFriends(String username);

}
