package test;

import java.util.ArrayList;
import java.util.List;
import model.Incaa;

public abstract class TestIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Incaa incaa1 = new Incaa();
			incaa1.agregarPelicula("Monsters INK");
			incaa1.agregarPelicula("Star Wars 7");
			incaa1.agregarPelicula("Iron MaN");
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			incaa2.agregarPelicula("Monsters INK");
			incaa2.agregarPelicula("Star Wars 7");
			incaa2.agregarPelicula("Monsters INK");
			System.out.println(incaa2.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa1 = new Incaa();
			incaa1.agregarPelicula("Monsters INK");
			incaa1.agregarPelicula("Star Wars 7");
			incaa1.agregarPelicula("Iron MaN");
			System.out.println(incaa1.traerPelicula(2).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			incaa2.agregarPelicula("Monsters INK");
			incaa2.agregarPelicula("Star Wars 7");
			incaa2.agregarPelicula("Star Wars 1");
			incaa2.agregarPelicula("Star Wars 5");
			System.out.println(incaa2.traerPelicula("star").toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa1 = new Incaa();
			incaa1.agregarPelicula("Monsters INK");
			incaa1.agregarPelicula("Star Wars 7");
			incaa1.agregarPelicula("Iron MaN");
			System.out.println(incaa1.toString());
			incaa1.modiicarPelicula(2, "iron man 2");
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa1 = new Incaa();
			incaa1.agregarPelicula("Monsters INK");
			incaa1.agregarPelicula("Star Wars 7");
			incaa1.agregarPelicula("Iron MaN");
			incaa1.modiicarPelicula(4, "iron man 2");
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}
}
