package business;

import entities.Kategori;
import dataAccess.IKategoriDao;
import java.util.Iterator;

import core.logging.Logger;
import dataAccess.IKategoriDao;
import entities.Kategori;

public class KategoriManager {
	private IKategoriDao _kategoriDao;
	private Kategori[] _kategoriler;
	private Logger[] _logger;
	
	public KategoriManager(IKategoriDao kategoriDao,Kategori[] kategoriler,Logger[] logger) {
		_kategoriDao = kategoriDao;
		_kategoriler = kategoriler;
		_logger = logger;
	}
	
	public void add(Kategori kategori) {
	
		for(Kategori ktgry:_kategoriler) {
			if (ktgry.getKategoriAdi()==kategori.getKategoriAdi()&& ktgry != kategori) {
				System.out.println("Kategori adı tekrar edemez");
			}
			else {
				_kategoriDao.add(kategori);
			}
		}
		
	}
		
	}

