package com.journaldev;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import com.journaldev.model.Rectangle;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.dao.RectangleDAO;

public class DriverRectangle
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RectangleDAO rectangelDAO = context.getBean(RectangleDAO.class);
		Scanner in = new Scanner(System.in);
		
		int choice = 0;
		do
		{
			choice = menu(in);	
			
			switch (choice)
			{
				case 1: 
					listAllRectangles(rectangelDAO); break;
				case 2:
					getRectangleById(rectangelDAO, in);	break;
				case 3: 
					deleteRectangleById(rectangelDAO, in);	break;
				case 4: 
					updateRectangleById(rectangelDAO, in);	break;
				case 5: 
					createRectangle(rectangelDAO, in);	break;
				case 6: 
					break;
				default: 
					System.out.println("Invalid Input! Try Again");
			}			
		}while(choice != 6);
		
		System.out.println("Thank you!");
		
		in.close();
		context.close();
	}
	
	private static void createRectangle(RectangleDAO rectangelDAO, Scanner in)
	{
		System.out.println("Please enter the following details below.");
		System.out.print("Length: "); 
		int length = in.nextInt();
		
		System.out.print("breadth: "); 
		int breadth = in.nextInt();
		
		Rectangle recToAdd = new Rectangle(length, breadth);
		rectangelDAO.createRectangle(recToAdd);
		System.out.println("New Rectangle Created\n");
		
	}

	private static void updateRectangleById(RectangleDAO rectangelDAO, Scanner in)
	{
		System.out.print("Please enter Rectangle ID: ");
		int id = in.nextInt();
		try
		{
			Rectangle rec = rectangelDAO.getRectangleById(id);
			System.out.println("Current Rectangle Details = " + rec);
			System.out.println("Please enter the following details below.");
			System.out.print("Length: "); 
			int length = in.nextInt();
			
			System.out.print("Breadth: "); 
			int breadth = in.nextInt();
			
			rec.setLength(length);
			rec.setBreadth(breadth);
			
			rectangelDAO.updateRectangle(rec);
			
			System.out.println("Updated Rectangle Details = " + rec);
			
			System.out.println("Rectangle details Updated!\n");
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Rectangle exist with ID: " + id);
		}
		
	}

	private static void deleteRectangleById(RectangleDAO rectangelDAO, Scanner in)
	{
		System.out.print("Please enter Rectangle ID to DELETE: ");
		int id = in.nextInt();
		try
		{
			rectangelDAO.deleteRectangle(id);
			System.out.println("Rectangle Deleted Successfully!");
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Rectangle exist with ID: " + id);
		}
		
	}

	private static void getRectangleById(RectangleDAO rectangelDAO, Scanner in)
	{
		System.out.print("Please enter Rectangle ID: ");
		int id = in.nextInt();
		try
		{
			System.out.println(rectangelDAO.getRectangleById(id));
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Rectangle exist with ID: " + id);
		}
	}

	private static void listAllRectangles(RectangleDAO rectangelDAO)
	{
		System.out.println("\n**********All Rectangles' List**********");
		for (Rectangle rec : rectangelDAO.getAllRectangles())
		{
			System.out.println(rec);
		}
		System.out.println("**************End of List**************\n");
	}

	private static int menu(Scanner in)
	{
		System.out.println("******************************");
		System.out.println("1. List All Rectangles.");
		System.out.println("2. Get Rectangle by ID.");
		System.out.println("3. Delete an Rectangle by ID.");
		System.out.println("4. Update an Rectangle by ID.");
		System.out.println("5. Create an Rectangle.");
		System.out.println("6. EXIT.");
		System.out.print("Enter your choice: ");
		
		int choice = in.nextInt();
		
		System.out.println("******************************");
		
		return choice;
	}

}
