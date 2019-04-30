import java.util.Scanner;

public class CricketPlayers {
	 int no_of_in, runs, not_out;
	 double bat_avg;
	 String name;
	
	CricketPlayers(){}
	CricketPlayers(String name,int no_of_in,int not_out,int runs)
	{
		this.name=name;
		this.no_of_in=no_of_in;
		this.not_out=not_out;
		this.runs=runs;
	}
	double calAvg()
	 {
		return bat_avg=runs/no_of_in;

	 }
	double getAvg() 
	{
		return bat_avg;
	}
	public String toString() {
		return "Name:" + name + ",Number of Innings:" + no_of_in + ",Not Out:" + not_out + ",Runs:" + runs +",Average:" + bat_avg;
		
	}
	public static void sortPlayers(CricketPlayers []cp, int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(cp[j].getAvg()>cp[j+1].getAvg())
				{
					CricketPlayers t=cp[j];
					cp[j]=cp[j+1];
					cp[j+1]=t;
			}
		}
	}
	}
	public static void main(String[] args) 
	{
		int no_of_in,not_out,runs,n1;
		String name;
	 System.out.println("Enter the no Players");
	 @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	 n1=scan.nextInt();
	 CricketPlayers ckp[] =new CricketPlayers[n1];
	 System.out.println("Enter the data");
	 for(int i=0;i<n1;i++)
     { 
		 System.out.println("Enter name");
		 name=scan.next();
		 
		 System.out.println("Enter the no of innings");
		 no_of_in=scan.nextInt();
		 
		 System.out.println("enter the no of times of not out");
		 not_out=scan.nextInt();
		 
		 System.out.println("Enter Total runs");
		 runs=scan.nextInt();
		 
		 ckp[i]=new CricketPlayers(name,no_of_in,not_out,runs);
		 ckp[i].calAvg();
	
     }
	  System.out.println("/n Data after sorting");
   for(int i=0;i<n1;i++)
   System.out.println(ckp[i]);
  
   sortPlayers(ckp,n1);
   		 
     }
	 
}