package UI;


import java.util.Iterator;

import business.EgitmenManager;
import business.KategoriManager;
import business.KursManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcEgitmenDao;
import dataAccess.JdbcKategoriDao;
import dataAccess.JdbcKursDao;
import entities.Egitmen;
import entities.Kategori;
import entities.Kurs;

public class Main {

	public static void main(String[] args) {
	
		Kategori[] kategoriler = new Kategori[] {new Kategori(1,"Web Geliştirme"),new Kategori(1,"Web Geliştirme1")};
		
		Egitmen egitmen = new Egitmen(1,1,"Engin","Reis",30,"Adam gibi adam");
		
		Kurs[] kurslar = new Kurs[] {new Kurs(1,1,1,"Java","İçerisi on numara",100),new Kurs(1,1,1,"Java1","İçerisi on numara",100)};

		Logger[] loggers = { new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		KategoriManager kategoriManager = new KategoriManager(new JdbcKategoriDao(),kategoriler,loggers);
		for(Kategori kategori:kategoriler) {
			kategoriManager.add(kategori);
			for(Logger log:loggers) {
				log.log("Loglama Başarılı");
			}
		}
		
		EgitmenManager egitmenManager = new EgitmenManager(new JdbcEgitmenDao(),loggers);
		egitmenManager.add(egitmen);
		for(Logger log:loggers) {
			log.log("Loglama Başarılı");
		}
		
		KursManager kursManager = new KursManager(new JdbcKursDao(),kurslar,loggers);
		for(Kurs kurs:kurslar) {
			kursManager.add(kurs);
			for(Logger log:loggers) {
				log.log("Loglama Başarılı");
			}
		}
		
		
		
		
	}

}
