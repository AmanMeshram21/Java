package org.fi;

public interface Cards
{
	public float checkBalance(long cardNo);
	public boolean transact(long cardNo,float amount);
	public default boolean voidTransaction(long cardNo) throws Exception
	{
		System.out.println("This is Default implementation");
		return false;
	}
	public static void display()
	{
		
	}
	

}
