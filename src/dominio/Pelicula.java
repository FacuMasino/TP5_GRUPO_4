package dominio;

public class Pelicula {

	// Atributos
	private static int idCounter=0;
	private final int id;
	private String nombre;
	private Genero genero;
	
	public Pelicula(String nombre, Genero cat) {
		idCounter++;
		this.id = idCounter;
		this.nombre = nombre;
		this.genero = cat;
	}
	
	// Setters Getters 
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	// Métodos
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", genero=" + genero + "]";
	}
	
}	
	
	
