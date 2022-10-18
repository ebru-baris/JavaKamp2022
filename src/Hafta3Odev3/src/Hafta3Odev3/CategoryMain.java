package Hafta3Odev3;


	import java.util.ArrayList;
	import java.util.List;
	import Hafta3Odev3.business.CategoryManager;
	import Hafta3Odev3.core.logging.DatabaseLogger;
	import Hafta3Odev3.core.logging.FileLogger;
	import Hafta3Odev3.core.logging.Logger;
	import Hafta3Odev3.core.logging.MailLogger;
	import Hafta3Odev3.dataAccsess.HibernateCategoryDao;
	import Hafta3Odev3.dataAccsess.JdbcCategoryDao;
	import Hafta3Odev3.entities.Category;

	public class CategoryMain {

		public static void main(String[] args) throws Exception {
			
			Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
			
		System.out.println("***********CATEGORY*********");
		
		        List<Category> categories = new ArrayList<>();
		        categories.add(new Category(1,"Programlama"));
		        categories.add(new Category(2,"Mobil Programlama"));
		       
		       
      CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers,categories);
		    
		        try {
		            categoryManager.add(new Category(3,"Web Tasarimi"));
		           
		        }catch (Exception e){
		            System.out.println(e);
}
		}
	}
