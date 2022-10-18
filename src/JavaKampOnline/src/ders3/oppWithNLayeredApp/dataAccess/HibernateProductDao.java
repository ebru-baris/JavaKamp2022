package ders3.oppWithNLayeredApp.dataAccess;

import ders3.oppWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır
		System.out.println("Hibernate ile veritabanina eklendi");

 }
}
