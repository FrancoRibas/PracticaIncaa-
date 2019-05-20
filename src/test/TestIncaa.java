package test;

import java.util.ArrayList;
import java.util.List;

import model.Genero;
import model.Incaa;

public abstract class TestIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Incaa incaa1 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa1.agregarPelicula("Monsters INK",gen1);
			incaa1.agregarPelicula("Star Wars 7",gen2);
			incaa1.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Monsters INK",gen1);
			System.out.println(incaa2.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa2.traerPelicula(2).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Star Wars 1",gen2);
			incaa2.agregarPelicula("Star Wars 5",gen2);
			System.out.println(incaa2.traerPelicula("star").toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa1 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa1.agregarPelicula("Monsters INK",gen1);
			incaa1.agregarPelicula("Star Wars 7",gen2);
			incaa1.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa1.toString());
			incaa1.modiicarPelicula(2, "iron man 2");
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa1 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa1.agregarPelicula("Monsters INK",gen1);
			incaa1.agregarPelicula("Star Wars 7",gen2);
			incaa1.agregarPelicula("Iron MaN",gen2);
			incaa1.modiicarPelicula(4, "iron man 2");
			System.out.println(incaa1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa2.toString());
			incaa2.eliminarPelicula(1);
			System.out.println(incaa2.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa2.toString());
			incaa2.eliminarPelicula(1);
			System.out.println(incaa2.toString());
			incaa2.eliminarPelicula(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Incaa incaa2 = new Incaa();
			Genero gen1 = new Genero(1,"infnaTILES");
			Genero gen2 = new Genero(1,"ficcion");
			incaa2.agregarPelicula("Monsters INK",gen1);
			incaa2.agregarPelicula("Star Wars 7",gen2);
			incaa2.agregarPelicula("Iron MaN",gen2);
			System.out.println(incaa2.toString());
			incaa2.eliminarPelicula(4);
			System.out.println(incaa2.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
