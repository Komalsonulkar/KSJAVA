public class MyClass 
{
		static int n;
		MyClass(int n)
		{
			MyClass.n=n;
		}
	public boolean isPositive()
	 {
		 if(n>=0)
			 return true;
		 else
			 return false;
	 }
	 public boolean isNegative()
	 {
			if(n<0)
				return true;
			else
				return false; 
	 }
	  public boolean isPrime()
		 {  
		  int m;
		 m=n/2;
			if(n<=1)
			{
				 return false;
			 }
			 else
			 {
				 for(int i=2;i<=m;i++)
				 {
					 if(n%i==0)
					 {
						 return false;
					 }
				 }
			return true;
			 }
			
}
public static void main(String[] args)
{ 
	MyClass num=new MyClass(-2);
	
	if(num.isPositive())
		System.out.println(n+" is positive ");
	{	
		if(num.isPrime())
		System.out.println(n+"is prime number ");
		else
			System.out.println(n+"is not prime number ");
	}
		if(num.isNegative())
			System.out.println(n+" is Negative ");
}
}