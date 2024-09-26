package principal;

import java.util.ArrayList;

import dominio.Genero;
import dominio.Pelicula;

public class Principal 
{

	public static void main(String[] args) {
		// pruebas...
		
		Genero g1 = new Genero("Acci�n");
		Genero g2 = new Genero("Animaci�n");
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(new Pelicula("Terminator", g1));
		peliculas.add(new Pelicula("Lluvia de Hamburguesas", g2));
		
		for(Pelicula p: peliculas) {
			System.out.println("La pelicula en cuestion es:  " + p);
		}
		
		MenuFrame menu = new MenuFrame();
	}
}