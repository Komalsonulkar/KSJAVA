package stats;

public class StatsOperation 
{
	private int x, y, z;
	public StatsOperation(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void average()
	{
		float avg = (x + y + z)/3;
		System.out.println("Average="+avg);
		
	}
	public void median()
	{
		System.out.println("Median="+y);
	}
 }
