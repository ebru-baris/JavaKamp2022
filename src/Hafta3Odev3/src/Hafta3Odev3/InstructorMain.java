package Hafta3Odev3;


	import java.util.ArrayList;
	import java.util.List;
	import Hafta3Odev3.business.InstructorManager;
	import Hafta3Odev3.core.logging.DatabaseLogger;
	import Hafta3Odev3.core.logging.FileLogger;
	import Hafta3Odev3.core.logging.Logger;
	import Hafta3Odev3.core.logging.MailLogger;
    import Hafta3Odev3.dataAccsess.HibernateInstructorDao;
    import Hafta3Odev3.dataAccsess.JdbcInstructorDao;
	import Hafta3Odev3.entities.Instructor;


	public class InstructorMain {

		public static void main(String[] args) {
			
			Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
			
		System.out.println("***********INSTRUCTOR*********");
		
		Instructor newInstructor = new Instructor(1, "Engin Demirog");   
		       
     InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
	   instructorManager.add(newInstructor);

   
		}
}
