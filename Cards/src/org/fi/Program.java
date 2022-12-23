package org.fi;

public class Program
{

	public static void main(String[] args)
	{
		try(Printer objPrinter = new Printer();)
		{
			objPrinter.print();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
