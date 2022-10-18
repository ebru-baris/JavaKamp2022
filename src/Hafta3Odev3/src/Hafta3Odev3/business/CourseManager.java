package Hafta3Odev3.business;

import java.util.List;

import Hafta3Odev3.core.logging.Logger;
import Hafta3Odev3.dataAccsess.CourseDao;
import Hafta3Odev3.entities.Category;
import Hafta3Odev3.entities.Course;

public class CourseManager {
	
	  private CourseDao courseDao;
	    private Logger[] loggers;
	    private List<Course> courses;

	    public CourseManager(CourseDao courseDao, Logger[] loggers,List<Course> courses) {
	        this.courseDao = courseDao;
	        this.loggers = loggers;
	        this.courses = courses;
	    }
	    
	    public  void add(Course course) throws Exception {
	    	 for (Course newCourse:courses){
		            if (course.getCourseName()==newCourse.getCourseName()){
		                throw  new Exception("Kurs ismi tekrar edemez!");
		      }
		         if (course.getCoursePrice()<0){
	            throw  new Exception("Kurs fiyati 0'dan kucuk olamaz");
	        }
	       
		         courseDao.add(course);
		 		courses.add(course);
		 		for (Logger logger : loggers) {
		 			logger.log(course.getCourseName());
		 		}
		         
	        }
	     
	       

}
}