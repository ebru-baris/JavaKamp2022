package Hafta3Odev3.business;

import Hafta3Odev3.core.logging.Logger;
import Hafta3Odev3.dataAccsess.CategoryDao;
import Hafta3Odev3.dataAccsess.InstructorDao;
import Hafta3Odev3.entities.Category;
import Hafta3Odev3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		System.out.println("Egitmen eklendi");
		
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorName());
		}

	}
}
