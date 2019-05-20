package model;

public class Genero {

	private int idGenero;
	private String genero;
	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		this.setGenero(genero);;
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero.toLowerCase();
	}
	
	public boolean equals(int id) {
	return this.getIdGenero()==id	;
	}
	
	
}
