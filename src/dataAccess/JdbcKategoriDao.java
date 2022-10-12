package dataAccess;

import entities.Kategori;

public class JdbcKategoriDao implements IKategoriDao {

	@Override
	public void add(Kategori kategori) {
		System.out.println("Kategori JDBC ile eklendi");
		
	}

}
