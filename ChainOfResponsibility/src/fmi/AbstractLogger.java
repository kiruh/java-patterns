package fmi;

public abstract class AbstractLogger {

	public static int ERROR = 3;
	public static int WARN = 2;
	public static int INFO = 1;
	
	
	protected int level;
	
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String message) {
		if(this.level <= level) {
			write(message);
		}else {
			if(this.nextLogger != null) {
				this.nextLogger.logMessage(level, message);
			}else {
				System.out.println("Unknown level value: " + level);
			}
		}
	}
	
	abstract protected void write(String message);
}
