package entities;

public class Kurs {
	int id;
	int kategoriid;
	int egitmenid;
	String kursAdi;
	String kursAciklama;
	double fiyat;
	
	
	
	
	
	
	


	public Kurs() {
		
	}


	public Kurs(int id, int kategoriid, int egitmenid, String kursAdi, String kursAciklama, double fiyat) {
		super();
		this.id = id;
		this.kategoriid = kategoriid;
		this.egitmenid = egitmenid;
		this.kursAdi = kursAdi;
		this.kursAciklama = kursAciklama;
		this.fiyat = fiyat;
	}


	
	public double getFiyat() {
		return fiyat;
	}
	
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	public int getEgitmenid() {
		return egitmenid;
	}
	public void setEgitmenid(int egitmenid) {
		this.egitmenid = egitmenid;
	}
	public String getKursAdi() {
		return kursAdi;
	}
	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}
	public String getKursAciklama() {
		return kursAciklama;
	}
	public void setKursAciklama(String kursAciklama) {
		this.kursAciklama = kursAciklama;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
