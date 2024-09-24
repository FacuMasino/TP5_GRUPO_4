package agregar;

public class Categoria {
	
	// Atributos
	
	private int id;
	private String nombre;
	
	// Setters and getters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	//toString
		
	}
	@Override
	public String toString() {
		return  id + " - " +  nombre ;
	} 
	
	
	
	
}