package com.java.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User
{
	@Id
	private String username;
	private String name;
	private String password;
	private String email;
	@OneToMany
	private Set<User> friends; 
	
	public User()
	{
		this.name = "";
		this.username = "";
		this.password = "";
		this.friends = new HashSet<User>();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<User> getFriends()
	{
		return friends;
	}

	public void setFriends(Set<User> friends)
	{
		this.friends = friends;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username.toLowerCase();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj.getClass() == this.getClass())
		{
			User _temp = (User) obj;
			return (_temp.username.equalsIgnoreCase(this.name));
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.username.hashCode();
	}

	public boolean addFriend(User friend)
	{
		if(friend != null && (!this.equals(friend)))
		{
			return this.friends.add(friend);
		}
		return false;
	}
	
	public boolean removeFriend(User friend)
	{
		if(friend != null && !(this.equals(friend)))
		{
			return this.friends.remove(friend);
		}
		return false;
	}

	public void removeAllFriends()
	{
		this.friends.clear();
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		String str = "[Username: " + this.getUsername() + ", Name: " + this.getName() + "]";
		return str;
	}
	
}
