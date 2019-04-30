package exceptionhandling;

class AgeNotWithinRangeException extends RuntimeException
	{ 
		public AgeNotWithinRangeException(String msg)
		{
			super(msg);
		}
		
	}

class NameNotValidException extends RuntimeException
	{
		public NameNotValidException(String msg)
		{
			super(msg);
		}
	}

	public class Student
	{
		private int rollNo;
		private String name;
		private int age;
		private String course;
		
		public Student(int rollNo, String name, int age, String course)
		{
			this.rollNo = rollNo;
			this.name = name;
			this.age = age;
			this.course = course;
		}
		
		public void checkAge()throws AgeNotWithinRangeException
		{
				if (age>15 || age<21)
				{
					throw new AgeNotWithinRangeException("Age is not between 15 and 21.... Please ReEnter the Age");
				}
		}
		
		public void checkName()throws NameNotValidException
		{
			
			for(int i= 0;i<name.length();i++)
			{
				char ch;
				ch=name.charAt(i);
				if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
				{
					{
						throw new NameNotValidException("Name is not valid....Please ReEnter the Name");
					}
				}
				
			}
			
		}
	}


