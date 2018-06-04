package pack;

import pack.calc;
public class test
{
	public static boolean checksum(int a,int b)
	{
		return calc.sum(a,b)==a+b;
	}
	public static boolean checksub(int a,int b)
	{
		return calc.sub(a,b)==a-b;
	}
	public static boolean checkmul(int a,int b)
	{
		return calc.mul(a,b)==a*b;
	}
	public static boolean checkdiv(int a,int b)
	{
		return calc.div(a,b)==a/b;
	}
	public static boolean checksum(double a,double b)
	{
		return calc.sum(a,b)==a+b;
	}
	public static boolean checksub(double a,double b)
	{
		return calc.sub(a,b)==a-b;
	}
	public static boolean checkmul(double a,double b)
	{
		return calc.mul(a,b)==a*b;
	}
	public static boolean checkdiv(double a,double b)
	{
		return calc.div(a,b)==a/b;
	}
	public static boolean MakeTest()
	{
		for (int i=-10;i<10;++i)
		{
			for (int j=-10;j<10;++j)
			{
				try
				{
					if (!(checksum(i,j)&&checksub(i,j)&&checkdiv(i,j)&&checkmul(i,j)))
					return false;
				}
				catch (java.lang.ArithmeticException ev)
				{
					if (j!=0) return false;
				}
			}
		}
		for (double i = -10.0; i<10.0; i+=1.0)
		{
			for (double j = -10.0; j<10.0; j+=1.0)
			{
				try
				{
					if (!(checksum(i,j)&&checksub(i,j)&&checkdiv(i,j)&&checkmul(i,j)))
					return false;
				}
				catch (java.lang.ArithmeticException ev)
				{
					if (j!=0) return false;
				}
			}
		}
		return true;
	}
}