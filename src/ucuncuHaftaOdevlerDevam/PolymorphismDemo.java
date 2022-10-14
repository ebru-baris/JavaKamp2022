package ucuncuHaftaOdevlerDevam;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
	/*	BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger : loggers) {
			logger.log("Log mesaji");
		}*/
		
		/*EmailLogger logger = new EmailLogger();
		logger.log("Log Mesaji");*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
