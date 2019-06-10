package fmi;

public class ChainOfResponsibilityMain {

	
	private static AbstractLogger getChainOfLoggers() {
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger warningLogger = new WarningLogger(AbstractLogger.WARN);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(warningLogger);
		warningLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	
	public static void main(String[] args) {

			AbstractLogger chainOfLoggers = getChainOfLoggers();
			
			chainOfLoggers.logMessage(1, "New message: log message");
			chainOfLoggers.logMessage(2, "New message: warn message");
			chainOfLoggers.logMessage(3, "New message: error message");
			
			chainOfLoggers.logMessage(0, "New message: Test message");
	}

}
