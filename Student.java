
public class Student
{
	static int num;
	private  int rNo;
	private double sPercent;
	private String sName;
	Student(){}
	Student(int rNo,String sName,double sPercent)
	{
		num++;
		System.out.println("Object Created : Obj No:" +num);
		this.rNo=rNo;
		 this.sName=sName;
		 this.sPercent=sPercent;
	}
	public String toString() {
		return "Roll Number:" + rNo + ",Student Name:" + sName + ",Percentage:" + sPercent;
	}
	public static void main(String[] args)
	{
		
		Student s=new Student(10,"Komal",75.5);
		System.out.println(s);
		Student ss=new Student(11,"sarika",77.5);
		System.out.println(ss);
	
	}
}
