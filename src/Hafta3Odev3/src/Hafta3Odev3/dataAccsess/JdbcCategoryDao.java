package Hafta3Odev3.dataAccsess;

import Hafta3Odev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanina eklendi");
		
	}

}
