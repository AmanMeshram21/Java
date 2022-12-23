package org.fi;

import java.util.Scanner;

public class Program1
{

	public static void main(String[] args)
	{
		Cards objCards = null;
		Scanner scanner = new Scanner(System.in);
		
		long cardNo =0;
		float amount = 0;
		int choice= 0;
		try {
			while(true){
				System.out.println("1. Credit Card");
				System.out.println("2. Debit Card");
				
				choice = scanner.nextInt();
				if(choice==1)
					objCards = new CreditCard();
				else
					objCards = new DebitCard();
				
				objCards.voidTransaction(1111);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
