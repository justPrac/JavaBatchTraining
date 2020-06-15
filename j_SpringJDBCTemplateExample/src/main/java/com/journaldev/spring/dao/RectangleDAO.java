package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.model.Rectangle;

public interface RectangleDAO
{
	public Rectangle getRectangleById(int id);
	
	public boolean updateRectangle(Rectangle rec);
	
	public boolean deleteRectangle(int id);
	
	public boolean createRectangle(Rectangle rec);
	
	public List<Rectangle> getAllRectangles();
}
