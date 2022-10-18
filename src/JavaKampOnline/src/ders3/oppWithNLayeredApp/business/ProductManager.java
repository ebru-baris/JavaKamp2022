                                                                                                        package ders3.oppWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import ders3.oppWithNLayeredApp.core.logging.Logger;
import ders3.oppWithNLayeredApp.dataAccess.HibernateProductDao;
import ders3.oppWithNLayeredApp.dataAccess.JdbcProductDao;
import ders3.oppWithNLayeredApp.dataAccess.ProductDao;
import ders3.oppWithNLayeredApp.entities.Product;


public class ProductManager {
	
	private ProductDao productDao;
	//private List<Logger> loggers;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { //List<Logger> loggers
		this.productDao = productDao;
		this.loggers = loggers;
	}



	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Urun fiyati 10 dan kucuk olamaz");
		}
		
		/*JdbcProductDao productDao =new JdbcProductDao();
		productDao.add(product);*/  //Jdbc ye bagimli
		
		/*HibernateProductDao productDao =new HibernateProductDao();
		productDao.add(product);*/ //Hibernate e bagimli
		
		//ProductDao productDao =new HibernateProductDao();
		productDao.add(product);
		
		
		for(Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
			
		}
		
	}

}
