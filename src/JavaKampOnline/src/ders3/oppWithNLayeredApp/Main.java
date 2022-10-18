package ders3.oppWithNLayeredApp;

import ders3.oppWithNLayeredApp.business.ProductManager;
import ders3.oppWithNLayeredApp.core.logging.DatabaseLogger;
import ders3.oppWithNLayeredApp.core.logging.FileLogger;
import ders3.oppWithNLayeredApp.core.logging.Logger;
import ders3.oppWithNLayeredApp.core.logging.MailLogger;
import ders3.oppWithNLayeredApp.dataAccess.HibernateProductDao;
import ders3.oppWithNLayeredApp.dataAccess.JdbcProductDao;
import ders3.oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"IPhone Xr",10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}