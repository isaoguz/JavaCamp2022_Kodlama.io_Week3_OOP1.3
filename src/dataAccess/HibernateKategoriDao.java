package dataAccess;

import entities.Kategori;

public class HibernateKategoriDao implements IKategoriDao {

	@Override
	public void add(Kategori kategori) {
		System.out.println("Kategori Hibernate ile eklendi");
		
	}

}
