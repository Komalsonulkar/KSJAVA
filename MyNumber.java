
public class MyNumber {

	static int n;
		MyNumber(int n)
		{
			MyNumber.n=n;
		}
	public boolean isPositive()
	 {
		 if(n>0)
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
	 public boolean isZero()
	 {
		 if (n==0)
			 return true;
		 else
			 return false;
	 }
	 public boolean isEven()
	 {
		 if (n%2==0)
			 return true;
		 else
			 return false;
		 
	 }
	 public boolean isOdd()
	 {
		 if(n%2!=0)
			 return true;
		 else
			 return false;
	 }
	 public static void main(String[] args)
	 { 
		int n=Integer.parseInt(args[0]);
	 	MyNumber no=new MyNumber(n);
	 	
	 	if(no.isPositive())
	 		System.out.println(n+" is positive ");
	 	else
	 	if(no.isNegative())
	 		System.out.println(n+" is Negative ");
	 	else
	 		if(no.isZero())
	 			System.out.println(n+"is Zero");
	 	
	 	if(no.isEven())
	 		System.out.println(n+"is Even");
	 	else
	 	if(no.isOdd())
	 		System.out.println(n+"is Odd");
	 }
	 }