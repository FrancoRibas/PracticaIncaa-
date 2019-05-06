package model;

import java.util.ArrayList;
import java.util.List;;

public class Incaa {

	private List<Pelicula> catalogo;

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + "]";
	}

	public boolean agregarPelicula(String pelicula) throws Exception {
		boolean agregado = false;
		int indice = 0;
		String nombrePelicula = pelicula.toLowerCase();
		if (catalogo.isEmpty()) {
			agregado = catalogo.add(new Pelicula(0, nombrePelicula));
		} else {
			//Conrtolo que la pelicula a agregar no este en la lista
			while (!agregado && indice < catalogo.size()) {
				
				
				
				indice++;
			}
		}

		return agregado;
	}

}