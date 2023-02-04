package codingAssignment;

public class App {

	static Logger logger;
	
	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		//Logger logger = new SpacedLogger();
		
		logger.log("Xenos");
		logger.error("Soluna");
		
		setLogger(new AsteriskLogger());
		setLogger(new SpacedLogger());
		
	}

	private static void setLogger(Logger l) {
		logger = l;
	}
	
}
