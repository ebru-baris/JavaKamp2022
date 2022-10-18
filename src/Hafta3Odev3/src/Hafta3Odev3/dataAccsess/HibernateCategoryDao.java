package Hafta3Odev3.dataAccsess;

import Hafta3Odev3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

}
