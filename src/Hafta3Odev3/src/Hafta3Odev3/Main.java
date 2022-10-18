package Hafta3Odev3;



	import java.util.ArrayList;
	import java.util.List;
	import Hafta3Odev3.business.CategoryManager;
    import Hafta3Odev3.business.CourseManager;
    import Hafta3Odev3.business.InstructorManager;
    import Hafta3Odev3.core.logging.DatabaseLogger;
	import Hafta3Odev3.core.logging.FileLogger;
	import Hafta3Odev3.core.logging.Logger;
	import Hafta3Odev3.core.logging.MailLogger;
	import Hafta3Odev3.dataAccsess.HibernateCategoryDao;
    import Hafta3Odev3.dataAccsess.HibernateCourseDao;
    import Hafta3Odev3.dataAccsess.HibernateInstructorDao;
    import Hafta3Odev3.dataAccsess.JdbcCategoryDao;
	import Hafta3Odev3.entities.Category;
    import Hafta3Odev3.entities.Course;
    import Hafta3Odev3.entities.Instructor;

     public class Main {

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
		            
		    			
		    		System.out.println("***********COURSE*********");
		    		   
		    		        List<Course> courses = new ArrayList<>();
		    		        courses.add(new Course(1,"Java","Programlama","Engin Demirog",200));
		    		        courses.add(new Course(2,"Kotlin","Mobil Programlama","atil Samancioglu",250));
		    		       
		    		        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
		    		        
		    		       try { courseManager.add(new Course(3,"Flutter","Mobil Uygulama","Veli Bacik",-1));
		    		           }catch (Exception e1){
		    		            System.out.println(e1);
		    		        }

		        
		        
		        System.out.println("***********INSTRUCTOR*********");
				
				Instructor newInstructor = new Instructor(1, "Engin Demirog");   
				       
		     InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
			   instructorManager.add(newInstructor);
		}
	}

