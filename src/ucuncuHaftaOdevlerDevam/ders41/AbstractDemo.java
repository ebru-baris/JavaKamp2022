package ucuncuHaftaOdevlerDevam.ders41;

public class AbstractDemo {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new SqlServerDatabaseManager();
		//customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();

	}

}
