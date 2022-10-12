package dataAccess;

import entities.Kurs;

public class JdbcKursDao implements IKursDao {

	@Override
	public void add(Kurs kurs) {
		System.out.println("Kurs JDBC ile eklendi");
		
	}

}
