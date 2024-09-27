package dominio;

public class Genero
{	
	// Atributos
	
	private static int idCounter = 0;
	private final int id;
	private String nombre;
	
	// Constructor
	
	public Genero(String nombre)
	{
		idCounter++;
		this.id = idCounter;
		this.nombre = nombre;
	}
	
	// Setters and getters
	
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
	
	// Métodos
	
	@Override
	public String toString()
	{
		return nombre ;
	}
}
