package Hafta3Odev3.business;

import java.util.ArrayList;
import java.util.List;

import Hafta3Odev3.core.logging.Logger;
import Hafta3Odev3.dataAccsess.CategoryDao;
import Hafta3Odev3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	public void add(Category category) throws Exception {
			for(Category newCatogryName:categories)
		if (category.getCategoryName() == newCatogryName.getCategoryName()) {
            throw new Exception("Kategori Ismi Tekrar Edemez!");
		}	
	
		categoryDao.add(category);
		 categories.add(category);
			
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
			
		}
	
	
	
	}
}
