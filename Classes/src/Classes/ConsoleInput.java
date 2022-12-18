
public class ConsoleInput {

	public static String getString() {
		
		try {
			byte [] arrInput = new byte[100];
			
			int length = System.in.read(arrInput);
			
			byte [] arrFinal = new byte[length-2];
			
			System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
			
			String data =new String(arrFinal);
			
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getInteger() {
		
		String data = getString();
		
		int intData = Integer.parseInt(data);
		
		return intData;
	}
	
	public static float getFloat() {
		
		return Float.parseFloat(getString());
	}

}
