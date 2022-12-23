package org.fi.date;
import org.fi.utility.ConsoleInput;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Date Program");
		try {
		Date objDate = new Date();

		while (true) {
			
			System.out.println(
					"Input\n1 Print Date \n2 for Add Days\n3 for Add Months\n4 for Add Years\n5 for Exit");
			System.out.println("Enter your choice");
			int choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1:
				System.out.println("Enter the day");
				int day = ConsoleInput.getInteger();
				System.out.println("Enter the month");
				int month = ConsoleInput.getInteger();
				System.out.println("Enter the year");
				int year = ConsoleInput.getInteger();

				objDate.setDate(day, month, year);
				System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
				break;
			
			case 2:
				System.out.println("Enter the number of days to be added to date");
				int noOfDays = ConsoleInput.getInteger();
				objDate.addDays(noOfDays);
				break;

			case 3:
				System.out.println("Enter the number of months to be added to date");
				int noOfMonths = ConsoleInput.getInteger();
				objDate.addMonths(noOfMonths);
				break;

			case 4:
				System.out.println("Enter the number of years to be added to date");
				int noOfYears = ConsoleInput.getInteger();
				objDate.addYear(noOfYears);
				break;

			case 5:
				System.out.println("Thank you! Have a nice day");
				System.exit(0);
		break;

			default:
				System.out.println("Enter the correct choice");
				break;

			}
		}

		}
		catch (Exception e) {
			e.setStackTrace(null);
		}
	}

}
