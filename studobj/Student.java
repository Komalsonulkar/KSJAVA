package studobj;

import java.util.Scanner;

import sy.SyMarks;
import ty.TyMarks;

public class Student 
{
	private
		int rNo;
		String name;
		TyMarks t;
		SyMarks s;
		
		public Student(int rNo, String name, SyMarks s, TyMarks t) 
		{
			super();
			this.rNo = rNo;
			this.name = name;
			this.t = t;
			this.s = s;
		}
		public static void main(String [] args)
		{
			int rNo=0,computer=0,maths=0,electronic=0,theory=0,practical=0;
			String name=null,grade=null;
			
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the no of students");
			int n=scan.nextInt();
			Student ss[]=new Student[n];
			
			
			for(int i=0;i<n;i++)
			{

			    System.out.print("\nEnter Roll No : ");
			    rNo=scan.nextInt();
			    
			    System.out.print("\nEnter Name : ");
			    name=scan.next();
			    
			    System.out.println("Enter marks :");
			    
				System.out.println("Enter computer total marks");
				computer = scan.nextInt();
				
				System.out.println("Enter maths total marks");
				maths = scan.nextInt();
				
				System.out.println("Enter electroic total marks");
				electronic = scan.nextInt();
				
				System.out.println("Enter theory marks");
				theory = scan.nextInt();
				
				System.out.println("Enter practical marks");
				practical = scan.nextInt();
				
				SyMarks s = new SyMarks(computer,maths,electronic);
				TyMarks t = new TyMarks(theory,practical);
				
				int total = computer + maths + electronic + theory +practical;
				int avg = total/5;
				
				if(avg >= 70)
				{
					grade = "A";
				}
				else if(avg >= 60)
				{
					grade = "B";
				}
				else if(avg >= 50 )
				{
					grade = "C";
				}
				else
				{
					grade = "c";
					System.out.println("Fail");
				}
				ss[i]= new Student(rNo,name,s,t);
			   
			}
			System.out.println("Roll Number \t  Name  \t  Computer marks  \t  Maths marks  \t  Electronic marks \t theory marks \t practical marks \t Grade" );
			
			for(int i=0;i<ss.length;i++)
			{
			System.out.println(rNo+ "\t\t"+name+ "\t\t\t" +computer+ "\t\t\t" +maths+ "\t\t"+electronic+ "\t\t\t" +theory+ "\t\t" +practical+ "\t\t"+grade);
			}
			
		}
}
