package ucuncuHaftaOdevlerDevam;

public class CustomerManager {
	private BaseLogger baseLogger;
	public CustomerManager (BaseLogger logger) {
		this.baseLogger = logger;
	}
	
	public void add() {
		System.out.println("Musteri eklendi");
		this.baseLogger.log("log mesaji");
		
		
		
		
		
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log("Log mesaji");*/
		
	}

}
