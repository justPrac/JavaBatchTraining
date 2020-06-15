package com.journaldev.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.journaldev.model.Rectangle;
import com.journaldev.model.RectangleMapper;

@Component
public class RectangleDAOImpl implements RectangleDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String SQL_FIND_RECTANGLE = "select * from rectangle where id = ?";
	private final String SQL_DELETE_RECTANGLE = "delete from rectangle where id = ?";
	private final String SQL_UPDATE_RECTANGLE = "update rectangle set length = ?, breadth = ? where id = ?";
	private final String SQL_GET_ALL = "select * from rectangle";
	private final String SQL_INSERT_RECTANGLE = "insert into rectangle(length, breadth) values(?,?)";


	public Rectangle getRectangleById(int id)
	{
		return jdbcTemplate.queryForObject(SQL_FIND_RECTANGLE, new Object[] {id}, new RectangleMapper());
	}

	public boolean updateRectangle(Rectangle rec)
	{
		return jdbcTemplate.update(SQL_UPDATE_RECTANGLE, new Object[] {rec.getLength(), rec.getBreadth(), rec.getId()}) > 0;
	}

	public boolean deleteRectangle(int id)
	{
		return jdbcTemplate.update(SQL_DELETE_RECTANGLE, new Object[] {id}) > 0;
	}

	public boolean createRectangle(Rectangle rec)
	{
		return jdbcTemplate.update(SQL_INSERT_RECTANGLE, new Object[] {rec.getLength(), rec.getBreadth()}) > 0;
	}

	public List<Rectangle> getAllRectangles()
	{
		return jdbcTemplate.query(SQL_GET_ALL, new RectangleMapper());
	}
	
}
