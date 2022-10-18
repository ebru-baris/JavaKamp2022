package Hafta3Odev3.dataAccsess;

import Hafta3Odev3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanina eklendi");
		
	}

}
