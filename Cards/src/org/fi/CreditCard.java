package org.fi;

public class CreditCard implements Cards 
{
	long cardNo = 7777;
	float balance = 5000;

	@Override
	public float checkBalance(long cardNo)
	{
		if(cardNo == 7777)
			return balance;
		else
		   return -1;
	}

	@Override
	public boolean transact(long cardNo, float amount)
	{
		if(cardNo == 7777 && amount < balance)
		{
			balance -= amount + (amount*2/100);
			return true;
		}
		return false;
	}

	@Override
	public boolean voidTransaction(long cardNo) throws Exception
	{
		System.out.println("Void Transaction");
		return true;
	}
	
	public void setBalance(float amount)
	{
		balance = amount;
	}
	
	

}
