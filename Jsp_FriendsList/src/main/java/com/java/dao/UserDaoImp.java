package com.java.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.java.model.User;

public class UserDaoImp implements UserDao
{
	private SessionFactory sessionFactory;
	
	public UserDaoImp()
	{
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml (override by passing value)
				.build();
		
		try 
		{
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
			// The registry would be destroyed by the SessionFactory, 
			// but we had trouble building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	private Session getSession()
	{
		return sessionFactory.openSession();
	}
	
	public User getUser(String username)
	{
		User user = null;
		
		Session session = getSession();
		session.beginTransaction();
		user = (User) session.get(User.class, username);
		session.close();
		
		System.out.println(user);
		
		return user;
	}

	@SuppressWarnings("unchecked")
	public Set<User> getAllUsers()
	{
		Set<User> allUsers = new HashSet<User>();
		
		Session session = getSession();
		session.beginTransaction();
		allUsers = (Set<User>) session.createQuery("from Users").list();
		session.close();
		
		return allUsers;
	}

	public boolean addUser(User u)
	{
		Session session = getSession();
		session.beginTransaction();
		
		User _temp = session.get(User.class, u.getUsername());
		
		if(_temp == null)
		{
			session.save(u);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		
		session.close();
		
		return false;
	}

	public boolean deleteUser(String username)
	{
		Session session = getSession();
		session.beginTransaction();
		
		User _temp = session.get(User.class, username);
		
		if(_temp != null)
		{
			session.remove(_temp);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		
		session.close();
		
		return false;
	}

	public boolean updateUser(User u, String username)
	{
		if(u.getUsername().equalsIgnoreCase(username))
		{
			Session session = getSession();
			session.beginTransaction();
			
			User _temp = session.get(User.class, username);
			
			if(_temp != null)
			{
				_temp.setFriends(u.getFriends());
				_temp.setName(u.getName());
				_temp.setEmail(u.getEmail());
				
				session.saveOrUpdate(_temp);
				session.getTransaction().commit();
				session.close();
				return true;
			}
			session.close();
		}
		return false;
	}

	public boolean addFriend(String username, User friend)
	{
		if(username != null)
		{
			Session session = getSession();
			session.beginTransaction();
			
			User _temp = session.get(User.class, username);
			
			if(_temp != null && _temp.addFriend(friend))
			{
				session.saveOrUpdate(_temp);
				session.getTransaction().commit();
				session.close();
				return true;
			}
			session.close();
		}
		return false;
	}

	public boolean removeFriend(String user_username, String friend_username)
	{
		if(user_username != null && friend_username != null && !user_username.equalsIgnoreCase(friend_username))
		{
			Session session = getSession();
			session.beginTransaction();
			
			User user = session.get(User.class, user_username);
			User friend = session.get(User.class, friend_username);
			
			if(user != null && friend != null && user.removeFriend(friend))
			{
				session.saveOrUpdate(user);
				session.getTransaction().commit();
				session.close();
				return true;
			}
			session.close();
		}
		return false;
	}

	public boolean removeAllFriends(String username)
	{
		if(username != null)
		{
			Session session = getSession();
			session.beginTransaction();
			
			User user = session.get(User.class, username);
			
			if(user != null)
			{
				user.removeAllFriends();
				session.saveOrUpdate(user);
				session.getTransaction().commit();
				session.close();
				return true;
			}
			session.close();
		}
		return false;
	}
	
	public Set<User> getAllFriends(String username)
	{
		User _temp = getUser(username);
		
		if(_temp != null)
		{
			return _temp.getFriends();
		}
		return null;
	}
}
