package business;

import java.util.Iterator;

import core.logging.Logger;
import dataAccess.IKursDao;
import entities.Kurs;


public class KursManager {
	private IKursDao _kursDao;
	private Kurs[] _kurslar;
	private Logger[] _logger;
	
	public KursManager(IKursDao kursDao,Kurs[] kurslar,Logger[] logger) {
		_kursDao = kursDao;
		_kurslar=kurslar;
		_logger = logger;
	}
	
	public void add(Kurs kurs) {
		
		for(Kurs krs : _kurslar) {
			if (krs.getKursAdi() == kurs.getKursAdi() && krs!=kurs ) {
				System.err.println("Kurs adı tekrar edemez");
			}
			if (krs.getFiyat()<0) {
				System.err.println("Kurs fiyatı 0 dan küçük olamaz");
			}
			else {
				_kursDao.add(kurs);
			}
		}
		
		
	
	}
}
