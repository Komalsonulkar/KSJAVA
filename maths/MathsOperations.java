package maths;

public class MathsOperations {
	private static int a, b, c;
	@SuppressWarnings("static-access")
	public MathsOperations(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public static void maximum()
	{
		if(a > b && a > c)
		{
			System.out.println(a+ "is maximum");
		}
		else if(b > a && b > c)
		{
			System.out.println(b+ "is maximum");
		
		}
		else
		{
			System.out.println(c+ "is maximum");
			
		}
	}
	public static void minimum()
	{
		if(a < b && a < c)
		{
			System.out.println(a+ "is minimum");
			
		}
		else if(b < a && b < c)
		{
			System.out.println(b+ "is minimum");
			
		}
		else
		{
			System.out.println(c+ "is minimum");
			
		}
	}
}

