package dominio;

public class Pelicula implements Comparable<Pelicula>
{
	// Atributos
	
	private static int idCounter = 0;
	private final int id;
	private String nombre;
	private Genero genero;
	
	// Constructor
	
	public Pelicula(String nombre, Genero cat)
	{
		idCounter++;
		this.id = idCounter;
		this.nombre = nombre;
		this.genero = cat;
	}
	
	// Setters y getters
	
	public int getId()
	{
		return id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public Genero getGenero()
	{
		return genero;
	}
	
	public void setGenero(Genero genero)
	{
		this.genero = genero;
	}

	// Métodos
	
	@Override
	public String toString()
	{
		return "(ID) " + id + " - " + nombre + " - " + genero ;
	}

	@Override
	public int compareTo(Pelicula peli) {
		if(peli.getNombre().toLowerCase().compareTo(this.nombre.toLowerCase()) == 0) return 0;
		if(peli.getNombre().toLowerCase().compareTo(this.nombre.toLowerCase()) < 0) return 1;
		return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Pelicula other = (Pelicula) obj;
		
		if (genero == null) {
			if (other.genero != null) return false;
		}
		else if (!genero.equals(other.genero)) {
			return false;			
		}
		if (id != other.id) return false;
		if (nombre == null) {
			if (other.nombre != null) return false;
		} 
		else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

}
