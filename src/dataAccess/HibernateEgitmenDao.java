package dataAccess;

import entities.Egitmen;

public class HibernateEgitmenDao implements IEgitmenDao {

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("Eğitmen Hibernate ile eklendi.");
		
	}

}
