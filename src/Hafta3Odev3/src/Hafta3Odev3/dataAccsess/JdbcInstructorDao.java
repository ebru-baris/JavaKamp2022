package Hafta3Odev3.dataAccsess;

import Hafta3Odev3.entities.Category;
import Hafta3Odev3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("JDBC ile veritabanina eklendi");
		
	}

}
