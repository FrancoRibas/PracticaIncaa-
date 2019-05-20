package model;

public class Pelicula {
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	public Pelicula(int idPelicula, String pelicula, Genero genero) throws Exception {
		super();
		this.idPelicula = idPelicula;
		this.setPelicula(pelicula);
		this.genero=genero;
	}
	
	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		String nombrePelicula = pelicula.toLowerCase();
		this.pelicula = nombrePelicula;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Incaa [idPelicula=" + idPelicula + ", pelicula=" + pelicula + "]";
	}

	// por nombre
	public boolean equals(Pelicula pelicula) {
		return this.pelicula==pelicula.getPelicula();
	}
	// por id
	public boolean equals(int idPelicula) {
		return this.idPelicula==idPelicula;
	}
	
	
	
	
}
