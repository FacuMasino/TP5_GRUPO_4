package principal;

import agregar.Categoria;
import dominio.Pelicula;

public class Principal 
{

	public static void main(String[] args) {
		// pruebas...
		
		Categoria c = new Categoria();
		c.setNombre("accion");
		
		Pelicula p = new Pelicula("terminator2",c);
		
		System.out.println("La pelicula en cuestion es:  " + p);
	}
}