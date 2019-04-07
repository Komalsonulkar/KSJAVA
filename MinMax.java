
public class MinMax
{
	private static int a,b,c;
	 	@SuppressWarnings("static-access")
		public MinMax(int a,int b, int c)
	 	{
	 		this.a=a;
	 		this.b=b;
	 		this.c=c;
	 	}
	 	public void Maximum()
	 	{
	 		if(a>b)
	 		{
	 			System.out.println(a+"is Maximum");
	 		}
	 		if (b>c)
	 		{
	 			System.out.println(b+"is Maximum");
	 		}
	 		else
	 		{
	 			System.out.println(c+"is Maximum");
	 		}
	 	}
	 	public void Minimum()
	 	{
	 		if(a<b)
	 		{
	 			System.out.println(a+"is Minimum");
	 		}
	 		if (b<c)
	 		{
	 			System.out.println(b+"is Minimum");
	 		}
	 		else
	 		{
	 			System.out.println(c+"is Minimum");
	 		}
	 	}
	public static void main(String[] args) {

		int a=Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		
		MinMax m=new MinMax(a,b,c);
		m.Maximum();
		m.Minimum();
	}

}
