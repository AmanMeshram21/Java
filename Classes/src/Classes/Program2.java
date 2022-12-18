
public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("Enter your First number:");
		
		int num1 = ConsoleInput.getInteger();
		
		System.out.println("Enter your Second number:");
		
		int num2 = ConsoleInput.getInteger();
		
		Calculator objCalculator = new Calculator();
		
		int result = objCalculator.add(num1, num2);
		
		System.out.println("Addition is "+result);
		
		result = objCalculator.subtract(num1, num2);
		
		System.out.println("Subtraction is "+result);
	}

}
