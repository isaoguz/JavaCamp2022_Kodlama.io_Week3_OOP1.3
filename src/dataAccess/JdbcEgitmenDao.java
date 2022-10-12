package dataAccess;

import entities.Egitmen;

public class JdbcEgitmenDao implements IEgitmenDao {

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("Eğitmen JDBC ile eklendi");
		
	}

}
