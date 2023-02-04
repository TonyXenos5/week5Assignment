package codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String store = "";
		
		for(int i = 0; i < log.length(); i++) {
			store += log.charAt(i) + " ";
		}
		
		System.out.println(store);
	}

	@Override
	public void error(String error) {
		String store = "";
		
		for(int i = 0; i < error.length(); i++) {
			store += error.charAt(i) + " ";
		}
		
		System.out.println("ERROR: " + store);
	}

}
