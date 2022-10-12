package entities;

public class Kategori {
	int id;
	String kategoriAdi;
	
	
	
	
	
	
	
	
	
	public Kategori() {
		
	}



	public Kategori(int id, String kategoriAdi) {
		super();
		this.id = id;
		this.kategoriAdi = kategoriAdi;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKategoriAdi() {
		return kategoriAdi;
	}
	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}
	
	
	
	
}
