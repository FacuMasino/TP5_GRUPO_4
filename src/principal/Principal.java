package principal;

import java.util.ArrayList;
import dominio.Genero;
import dominio.Pelicula;

public class Principal 
{
	public static void main(String[] args)
	{
		// Pruebas
		
		Genero g1 = new Genero("Acción");
		Genero g2 = new Genero("Animación");
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(new Pelicula("Terminator", g1));
		peliculas.add(new Pelicula("Lluvia de Hamburguesas", g2));
		
		for(Pelicula p: peliculas)
		{
			System.out.println("La pelicula en cuestion es:  " + p);
		}
		
		JFPrincipal menu = new JFPrincipal();		
	}
}