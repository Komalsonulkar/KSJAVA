package test;

import maths.MathsOperations;
import stats.StatsOperation;

public class Test 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		MathsOperations mo = new MathsOperations(a,b,c);
		StatsOperation s = new StatsOperation(a,b,c);
		mo.maximum();
		mo.minimum();
		
		s.average();
		s.median();
		
	}


}
