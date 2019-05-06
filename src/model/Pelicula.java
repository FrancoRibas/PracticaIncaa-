package model;

public class Pelicula {
	private int idPelicula;
	private String pelicula;

	public Pelicula(int idPelicula, String pelicula) throws Exception {
		super();
		this.idPelicula = idPelicula;
		this.setPelicula(pelicula);
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

	@Override
	public String toString() {
		return "Incaa [idPelicula=" + idPelicula + ", pelicula=" + pelicula + "]";
	}

	public boolean equals(Pelicula pelicula) {
		
		return true;
	}
	
	
}
