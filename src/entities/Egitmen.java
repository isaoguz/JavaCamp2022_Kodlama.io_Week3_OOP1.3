package entities;

public class Egitmen {
	int id;
	int kategoriid;
	String egitmenAdi;
	String egitmenSoyadi;
	int egitmenYasi;
	String egitmenAciklama;
	
	
	
	
	
	
	
	
	public Egitmen() {
		
	}



	public Egitmen(int id, int kategoriid, String egitmenAdi, String egitmenSoyadi, int egitmenYasi,
			String egitmenAciklama) {
		super();
		this.id = id;
		this.kategoriid = kategoriid;
		this.egitmenAdi = egitmenAdi;
		this.egitmenSoyadi = egitmenSoyadi;
		this.egitmenYasi = egitmenYasi;
		this.egitmenAciklama = egitmenAciklama;
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
	
	public String getEgitmenAdi() {
		return egitmenAdi;
	}
	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}
	
	public String getEgitmenSoyadi() {
		return egitmenSoyadi;
	}
	public void setEgitmenSoyadi(String egitmenSoyadi) {
		this.egitmenSoyadi = egitmenSoyadi;
	}
	
	public int getEgitmenYasi() {
		return egitmenYasi;
	}
	public void setEgitmenYasi(int egitmenYasi) {
		this.egitmenYasi = egitmenYasi;
	}
	
	public String getEgitmenAciklama() {
		return egitmenAciklama;
	}
	public void setEgitmenAciklama(String egitmenAciklama) {
		this.egitmenAciklama = egitmenAciklama;
	}
	
	
}
