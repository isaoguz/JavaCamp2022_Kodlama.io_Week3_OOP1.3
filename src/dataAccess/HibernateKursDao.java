package dataAccess;

import entities.Kurs;

public class HibernateKursDao implements IKursDao {

	@Override
	public void add(Kurs kurs) {
		System.out.println("Kurs Hibernate ile eklendi");
		
	}

}
