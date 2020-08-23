package com.java.service;

import java.util.Set;

import com.java.dao.UserDao;
import com.java.dao.UserDaoImp;
import com.java.model.User;

public class UserServiceImp implements UserService
{
	private static UserDao userDao = new UserDaoImp();

	public User getUser(String username)
	{
		if(username != null)
		{
			return userDao.getUser(username);
		}
		return null;
	}

	public Set<User> getAllUsers()
	{
		return this.getAllUsers();
	}

	public boolean addUser(User u)
	{
		if(u != null)
		{
			return userDao.addUser(u);
		}
		return false;
	}

	public boolean deleteUser(String username)
	{
		if(username != null)
		{
			return userDao.deleteUser(username);
		}
		return false;
	}

	public boolean updateUser(User u, String username)
	{
		if(username != null && u != null)
		{
			return userDao.updateUser(u, username);
		}
		return false;
	}

	public boolean addFriend(String user_username, User friend)
	{
		if(user_username != null && friend != null)
		{
			return userDao.addFriend(user_username, friend);
		}
		return false;
	}

	public boolean removeFriend(String user_username, String friend_username)
	{
		if(user_username != null && friend_username != null)
		{
			return userDao.removeFriend(user_username, friend_username);
		}
		return false;
	}

	public Set<User> getAllFriends(String username)
	{
		if(username != null)
		{
			return userDao.getAllFriends(username);
		}
		return null;
	}

	public boolean removeAllFriends(String username)
	{
		if(username != null)
		{
			return userDao.removeAllFriends(username);
		}
		return false;
	}

	public boolean validateUser(String username, String password)
	{
		if(username != null && password != null)
		{
			User user = userDao.getUser(username);
			return (user != null && user.getPassword().equals(password));
		}
		return false;
	}
}
