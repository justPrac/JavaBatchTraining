package com.journaldev.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RectangleMapper implements RowMapper<Rectangle>
{

	public Rectangle mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Rectangle rec = new Rectangle();
		rec.setLength(rs.getInt("length"));
		rec.setBreadth(rs.getInt("breadth"));
		rec.setId(rs.getInt("id"));
		return rec;
	}

}
