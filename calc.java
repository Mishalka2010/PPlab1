package pack;

public class calc
{
	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a, int b)
	{
		if (b==0)
			throw new java.lang.ArithmeticException("Division by 0!");
		else
			return a/b;
	}
	public static double sum(double a, double b)
	{
		return a+b;
	}
	public static double sub(double a, double b)
	{
		return a-b;
	}
	public static double mul(double a, double b)
	{
		return a*b;
	}
	public static double div(double a, double b)
	{
		if (b==0.0)
			throw new java.lang.ArithmeticException("Division by 0!");
		else
			return a/b;
	}
}