package org.fi;

public class DebitCard implements Cards
{
	long cardNo = 7777;
	float balance = 5000;

	@Override
	public float checkBalance(long cardNo)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean transact(long cardNo, float amount)
	{
		if(cardNo == 7777 && amount < balance)
		{
			balance -= amount;
			return true;
		}
		return false;
	}

}
