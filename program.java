package pack;

import pack.calc;
import pack.test;

public class program
{
	public static final int TYPE_INT = 1;
	public static final int TYPE_DOUBLE = 2;
    public static void main(String[] args)
    {
		if (test.MakeTest())
			System.out.println("Test OK!");
		else
			throw new java.lang.Error("Test failed!");
		
		if (args.length!=3)
			return;
		int n1=0,n2=0;
		double d1=0.0,d2=0.0;
		int f=TYPE_INT;
		
		try
		{
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[2]);
		}
		catch (NumberFormatException ev)
		{
			try
			{
				d1=Double.parseDouble(args[0]);
				d2=Double.parseDouble(args[2]);
				f=TYPE_DOUBLE;
			}
			catch (NumberFormatException evt)
			{
				throw new java.lang.Error("Not correct numbers!");
			}
		}
		
		if (f==TYPE_INT)
		{
			int res=0;
			if 	(args[1].equals("+"))
				res=calc.sum(n1,n2);
			else if (args[1].equals("-"))
				res=calc.sub(n1,n2);
			else if (args[1].equals("x"))
				res=calc.mul(n1,n2);
			else if (args[1].equals("/"))
				res=calc.div(n1,n2);
			else
				throw new java.lang.Error("Not correct operator!");
			System.out.println(res);
		}
		else if (f==TYPE_DOUBLE)
		{
			double res=0.0;
			if (args[1].equals("+"))
				res=calc.sum(d1,d2);
			else if (args[1].equals("-"))
				res=calc.sub(d1,d2);
			else if (args[1].equals("x"))
				res=calc.mul(d1,d2);
			else if (args[1].equals("/"))
				res=calc.div(d1,d2);
			else
				throw new java.lang.Error("Not correct operator!");
			System.out.println(res);
		}
    }
}