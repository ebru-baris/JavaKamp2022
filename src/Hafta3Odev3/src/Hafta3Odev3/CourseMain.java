package Hafta3Odev3;


	import java.util.ArrayList;
	import java.util.List;
	import Hafta3Odev3.business.CourseManager;
	import Hafta3Odev3.core.logging.DatabaseLogger;
	import Hafta3Odev3.core.logging.FileLogger;
	import Hafta3Odev3.core.logging.Logger;
	import Hafta3Odev3.core.logging.MailLogger;
	import Hafta3Odev3.dataAccsess.HibernateCourseDao;
    import Hafta3Odev3.entities.Course;


	public class CourseMain {

		public static void main(String[] args) throws Exception {
			
			Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
			
		System.out.println("***********COURSE*********");
		   
		        List<Course> courses = new ArrayList<>();
		        courses.add(new Course(1,"Java","Programlama","Engin Demirog",200));
		        courses.add(new Course(2,"Kotlin","Mobil Programlama","atil Samancioglu",250));
		       
		        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
		        
		       try { courseManager.add(new Course(3,"Flutter","Mobil Uygulama","Veli Bacik",-1));
		           }catch (Exception e){
		            System.out.println(e);
		        }
		            }
		
		
		
		
	}
	
	      
		        
		  
		   