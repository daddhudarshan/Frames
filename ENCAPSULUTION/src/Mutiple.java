
public class Mutiple
{
	public static void main (String[] args)
	{
		try
		{
			int a=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("i am handled");
		}
		catch (Exception e)
		{
			System.out.println("i am handled 2nd time");
		}
		
		
	}
}
