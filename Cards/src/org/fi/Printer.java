package org.fi;

import java.io.Closeable;
import java.io.IOException;

public class Printer implements Closeable
{
	public void print() throws Exception
	{
		System.out.println("Printing........");
	}

	@Override
	public void close() throws IOException
	{
		// TODO Auto-generated method stub
		
	}

}
