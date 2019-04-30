package exceptionhandling;

import java.util.Scanner;

public class TestStudent 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Roll no:,Name:,Age:,Course:");
		int rollNo = scan.nextInt();
		String name = scan.next();
		int age = scan.nextInt();
		String course =  scan.next();
		
		Student s = new Student(rollNo,name,age,course);

		try
		{ 
			s.checkAge();
			
		}
		catch(AgeNotWithinRangeException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{ 
			s.checkName();
		}
		catch(NameNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

