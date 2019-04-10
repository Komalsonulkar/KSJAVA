import java.util.Scanner;

public class StudentClass
{
	static int num;
	private  int rNo;
	private double sPercent;
	private String sName;
	StudentClass(){}
	StudentClass(int rNo,String sName,double sPercent)
	{
		this.rNo=rNo;
		this.sName=sName;
		this.sPercent=sPercent;
	}
	public String toString() {
		return "Roll Number:" + rNo + ",Student Name:" + sName + ",Percentage:" + sPercent;
	}

	static void sortStudent(StudentClass []sc)
	{
		int temp_rNo;
		String temp_sName;
		double temp_sPercent;
		
		for(int i=1;i<StudentClass.num;i++)
		{
			System.out.println(i);
			  for(int j=0;j<i;j++)
			   {        
			   
			    if(sc[i].sPercent>sc[j].sPercent)
			    { 
			    
			    	temp_rNo=sc[i].rNo;
			    	temp_sPercent=sc[i].sPercent;
			    	temp_sName=sc[i].sName;
			     

			    	sc[i].rNo=sc[j].rNo;
			    	sc[i].sPercent=sc[j].sPercent;
			    	sc[i].sName=sc[j].sName;
			    	sc[j].rNo=temp_rNo;
			    	sc[j].sPercent=temp_sPercent;
			    	sc[j].sName=temp_sName;
			    }
			  }
		}

		  System.out.println("\nData After Sorting In Descending Order Of Percentage : \n");
		               
		  for(int i=0;i<StudentClass.num;i++)
		         System.out.println(sc[i]);
		  

 }

	public static void main(String[] args) 
	{
		int n1,rNo;
		String sName;
		double sPercent;
		
		System.out.println("\n Enter the no of student:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		n1=scan.nextInt();
		StudentClass a[]=new StudentClass[n1];
		System.out.println("\nEnter The Data : \n");
		   
	     for(int i=0;i<n1;i++)
	     { 
	   
	    System.out.print("\n\nRoll No : ");
	    rNo=scan.nextInt();
	    
	    System.out.print("\n\nName : ");
	    sName=scan.next();
	   
	    System.out.print("\n\nPercentage : ");
	    sPercent=scan.nextDouble();  
	   
	    StudentClass.num++;
	    a[i]=new StudentClass(rNo,sName,sPercent);
	   
	    }
	     System.out.println("\nTotal No Of Students : "+StudentClass.num+"\nData Before Sorting : \n");
	  
	   for(int i=0;i<n1;i++)
	   System.out.println(a[i]);
	  
	   sortStudent(a);
	   
	  }	  
}


