package Hafta3Odev3.dataAccsess;

import Hafta3Odev3.entities.Category;
import Hafta3Odev3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi");
		
	}

}
