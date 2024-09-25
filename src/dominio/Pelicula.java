package dominio;

import agregar.Categoria;

public class Pelicula {

	private static int id=0;
	private String nombre;
	private Categoria categoria;
	
	
	public Pelicula(String nombre, Categoria cat) {
		id++;
		this.nombre = nombre;
		this.categoria=new Categoria();
		this.categoria.setNombre(cat.getNombre()); 
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", categoria=" + categoria + "]";
	}
}	
	
	
