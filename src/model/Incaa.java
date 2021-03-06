package model;

import java.util.ArrayList;
import java.util.List;;

public class Incaa {

	private List<Pelicula> catalogo;

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public Incaa() {
		super();
		this.catalogo = new ArrayList<Pelicula>();
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

	public boolean agregarPelicula(String pelicula, Genero genero) throws Exception {
		boolean agregado = false;
		String nombrePelicula = pelicula.toLowerCase();
		if (catalogo.isEmpty()) {
			agregado = catalogo.add(new Pelicula(0, nombrePelicula,genero));
		} else {
			// Conrtolo que la pelicula a agregar no este en la lista
			for (int i = 0; i < catalogo.size(); i++) {
				if (catalogo.get(i).getPelicula().equals(nombrePelicula)) {
					throw new Exception("Error: la pelicula ya esta en el caltalogo");
				}
			}
			agregado = catalogo
					.add(new Pelicula(catalogo.get(catalogo.size() - 1).getIdPelicula() + 1, nombrePelicula, genero));
		}

		return agregado;
	}

	public Pelicula traerPelicula(int idPelicula) {
		Pelicula peliculaRetornar = null;
		int indice = 0;
		while (peliculaRetornar == null && indice < catalogo.size()) {
			if (catalogo.get(indice).equals(idPelicula)) {
				peliculaRetornar = catalogo.get(indice);
			}
			indice++;
		}

		return peliculaRetornar;
	}
	
	public List<Pelicula> traerPelicula(String parte) {
		parte = parte.toLowerCase();
		List<Pelicula> listaPelicula = new ArrayList<Pelicula>();
		int indice = 0;
		while (indice < catalogo.size()) {
			if (catalogo.get(indice).getPelicula().indexOf(parte) > -1) {
				listaPelicula.add(catalogo.get(indice));
			}
			indice++;
		}

		return listaPelicula;
	}

	public List<Pelicula> traerPelicula(Genero genero) {
		List<Pelicula> listaPelicula = new ArrayList<Pelicula>();
		int indice = 0;
		while (indice < catalogo.size()) {
			if (catalogo.get(indice).getGenero().equals(genero.getIdGenero())) {
				listaPelicula.add(catalogo.get(indice));
			}
			indice++;
		}

		return listaPelicula;
	}
	
	public boolean modiicarPelicula(int id, String pelicula) throws Exception {
		String nombrePelicula = pelicula.toLowerCase();
		Pelicula peliculaSeleccionada = traerPelicula(id);
		boolean modificado = false;
		if (peliculaSeleccionada != null) {
			peliculaSeleccionada.setPelicula(pelicula);
			modificado = true;
		} else {
			throw new Exception("La pelicula a modificar no existe");
		}
		return modificado;
	}

	public boolean eliminarPelicula(int id) throws Exception {
		boolean quitado = false;
		Pelicula peliculaSeleccionada = traerPelicula(id);
		if (peliculaSeleccionada != null) {
			catalogo.remove(peliculaSeleccionada);
		} else {
			throw new Exception("La pelicula a eliminar no existe");
		}
		return quitado;
	}

}